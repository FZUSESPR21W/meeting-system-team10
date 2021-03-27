<template>
  <div id="register">
    <Form ref="formCustom" :model="formCustom" :rules="ruleCustom" :label-width="80">
      <FormItem label="账号" prop="user">
        <Input type="text" v-model="formCustom.user"></Input>
      </FormItem>
      <FormItem label="密码" prop="passwd">
        <Input type="password" v-model="formCustom.passwd"></Input>
      </FormItem>
      <FormItem label="确认密码" prop="passwdCheck">
        <Input type="password" v-model="formCustom.passwdCheck"></Input>
      </FormItem>
      <FormItem>
        <Button type="primary" @click="handleSubmit('formCustom')">注册</Button>
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
#register{

  background-color: aquamarine;

}
</style>
