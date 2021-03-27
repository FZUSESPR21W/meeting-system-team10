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
          { type: 'string', min: 6, message: this.$t('login.mes2'), trigger: 'blur' }
        ],
        password: [
          { required: true, message: this.$t('login.mes3'), trigger: 'blur' },
          { type: 'string', min: 6, message: this.$t('login.mes4'), trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    handleSubmit (name) {
      // this.$refs[name].validate((valid) => {
      //   if (valid) {
      //     this.$Message.success('Success!')
      //   } else {
      //     this.$Message.error('Fail!')
      //   }
      // })
      this.$router.push('/userIndex')
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
