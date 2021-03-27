<template>
  <div id="login">
    <Form ref="formInline" :model="formInline" :rules="ruleInline">
      <FormItem prop="user">
        <Input class="input" type="text" v-model="formInline.user" :placeholder="$t('login.holder1')">
          <Icon type="ios-person-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem prop="password">
        <Input type="password" v-model="formInline.password" :placeholder="$t('login.holder2')">
          <Icon type="ios-lock-outline" slot="prepend"></Icon>
        </Input>
      </FormItem>
      <FormItem style="display: flex;justify-content: center;">
        <Button id="login_button" type="primary" @click="handleSubmit('formInline')">{{$t('index.login')}}</Button>
      </FormItem>
    </Form>
  </div>
</template>

<script>
// import axios from 'axios'

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
          { required: true, message: this.$t('login.mes1'), trigger: 'blur' },
          { type: 'string', min: 3, message: this.$t('login.mes4'), trigger: 'blur' }
        ],
        password: [
          { required: true, message: this.$t('login.mes3'), trigger: 'blur' },
          { type: 'string', min: 3, message: this.$t('login.mes3'), trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        // if (valid) {
        // this.$Message.success('Success!')
        // this.$axios.get('/user/login', {
        //   params: {
        //     account: this.formInline.user,
        //     password: this.formInline.password
        //   }
        // }, { headers: { 'Content-Type': 'application/x-www-form-urlencoded format' } })
        //   .then(res => {
        //     window.localStorage.setItem('account', this.formInline.user)
        //     window.localStorage.setItem('password', this.formInline.password)
        //     window.localStorage.setItem('type', res.data.type)
        //     if (res.data.type === 1) {
        //       this.$router.push({ path: '/chairmanIndex' })
        //     } else if (res.data.type === 2) {
        //       this.$router.push({ path: '/viceChairmanIndex' })
        //     } else if (res.data.type === 3) {
        //       this.$router.push({ path: '/secretaryIndex' })
        //     } else if (res.data.type === 4) {
        this.$router.push({ path: '/userIndex' })
        //   }
        // }).catch(error => {
        //   console.log(error)
        //   this.$Message.error('Login Fail!')
        // })
        // } else {
        //   this.$Message.error('Fail!')
        // }
      })
      // this.$router.push('/userIndex')
    }
  }

}
</script>

<style scoped lang="less">

#login_button{
  width: 320px;
  background-color: #2a4766;
}

</style>
