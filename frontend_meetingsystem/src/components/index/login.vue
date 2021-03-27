<template>
  <div id="login">
    <Form ref="formInline" :model="formInline" :rules="ruleInline" inline>
      <FormItem prop="user">
        <Input type="text" v-model="formInline.user" placeholder="Username">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem prop="password">
        <Input type="password" v-model="formInline.password" placeholder="Password">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem>
        <Button type="primary" @click="handleSubmit('formInline')">登录</Button>
      </FormItem>
    </Form>
  </div>
</template>

<script>
export default {
  name: 'login.vue',
  data () {
    return {
      formInline: {
        user: '',
        password: ''
      },
      ruleInline: {
        user: [
          { required: true, message: '请输入账号', trigger: 'blur' },
          { type: 'string', min: 6, message: '密码不能少于6位', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { type: 'string', min: 6, message: '密码不能少于6位', trigger: 'blur' }
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
#login{

  background-color: aquamarine;

}
</style>
