<template>
  <div id="register">
    <Form ref="formCustom" :model="formCustom" :rules="ruleCustom" >
      <FormItem  prop="user">
        <Input type="text" v-model="formCustom.user" placeholder="账号">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="contact">
        <Input type="text" v-model="formCustom.contact" placeholder="联系方式">
          <Icon type="ios-call-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="passwd">
        <Input type="password" v-model="formCustom.passwd" placeholder="密码">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem  prop="passwdCheck">
        <Input type="password" v-model="formCustom.passwdCheck" placeholder="确认密码">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem style="display: flex;justify-content: center;">
        <Button id="register_button" type="primary" @click="handleSubmit('formCustom')">注册</Button>
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
        callback(new Error('请输入密码!'))
      } else if (value.length < 6) {
        callback(new Error('密码不能小于6位!'))
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
        callback(new Error('请再次输入密码!'))
      } else if (value !== this.formCustom.passwd) {
        callback(new Error('两次密码输入不一致!!'))
      } else {
        callback()
      }
    }
    const validateContact = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('联系方式不能为空!'))
      } else {
        callback()
      }
    }

    const validateUser = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('账号不能为空!'))
      }

      // 模拟异步验证效果
      setTimeout(() => {
        if (value.length < 6) {
          callback(new Error('账号位数不能少于6位!'))
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
  width: 220px;
  background-color: #2a4766;
}
</style>
