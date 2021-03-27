<template>
  <div id="register">
    <Form ref="formCustom" :model="formCustom" :rules="ruleCustom" >
      <FormItem  prop="user">
        <Input type="text" v-model="formCustom.user" :placeholder="$t('register.holder1')">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="contact">
        <Input type="text" v-model="formCustom.contact" :placeholder="$t('register.holder2')">
          <Icon type="ios-call-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="passwd">
        <Input type="password" v-model="formCustom.passwd" :placeholder="$t('register.holder3')">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="passwdCheck">
        <Input type="password" v-model="formCustom.passwdCheck" :placeholder="$t('register.holder4')">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem style="display: flex;justify-content: center;">
        <Button id="register_button" type="primary" @click="handleSubmit('formCustom')">{{$t('register.btn')}}</Button>
      </FormItem>
    </Form>
  </div>
</template>

<script>
export default {
  name: 'register',
  data () {
    const validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error(this.$t('register.error1')))
      } else if (value.length < 6) {
        callback(new Error(this.$t('register.error2')))
      } else {
        if (this.formCustom.passwdCheck !== '') {
          // 对第二个密码框单独验证
          this.$refs.formCustom.validateField('passwdCheck')
        }
        callback()
      }
    }
    const validatePassCheck = (rule, value, callback) => {
      if (value === '') {
        callback(new Error(this.$t('register.error3')))
      } else if (value !== this.formCustom.passwd) {
        callback(new Error(this.$t('register.error4')))
      } else {
        callback()
      }
    }
    const validateContact = (rule, value, callback) => {
      if (value === '') {
        callback(new Error(this.$t('register.error5')))
      } else {
        callback()
      }
    }

    const validateUser = (rule, value, callback) => {
      if (value === '') {
        callback(new Error(this.$t('register.error6')))
      }

      // 模拟异步验证效果
      setTimeout(() => {
        if (value.length < 6) {
          callback(new Error(this.$t('register.error7')))
        } else {
          callback()
        }
      }, 1000)
    }

    return {
      formCustom: {
        user: '',
        contact: '',
        passwd: '',
        passwdCheck: ''
      },
      ruleCustom: {
        passwd: [
          { validator: validatePass, trigger: 'blur' }
        ],
        passwdCheck: [
          { validator: validatePassCheck, trigger: 'blur' }
        ],
        user: [
          { validator: validateUser, trigger: 'blur' }
        ],
        contact: [
          { validator: validateContact, trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          this.$Message.success('Success!')
          this.$axios.post('/user/register', {
            params: {
              account: this.formCustom.contact,
              password: this.formCustom.passwd
            }
          })
            .then(res => {
              window.localStorage.setItem('account', this.formCustom.contact)
              window.localStorage.setItem('password', this.formCustom.passwd)
              this.$router.push({ path: '/userIndex' })
            }).catch(error => {
              console.log(error)
              this.$Message.error('Rgister Fail!')
            })
        } else {
          this.$Message.error('Fail!')
        }
      })
    }
  }
}
</script>

<style scoped lang="less">
#register_button{
  width: 320px;
  background-color: #2a4766;
}
</style>
