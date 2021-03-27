<template>
  <div id="index">
    <div id="panel">
      <div id="left" @click="changeToLogin">登录</div>
      <div id="right" @click="changeToRegister">注册</div>
      <div v-if="isLogin===1"><Login/>
      </div>
      <div v-else>
        <Register/></div>
    </div>

  </div>
</template>

<script>
import Login from '../components/index/login.vue'
import Register from '../components/index/register'
export default {
  name: 'index',
  data () {
    return {
      isLogin: 1
    }
  },
  components: {
    Login,
    Register
  },
  methods: {
    changeToLogin () {
      this.isLogin = 1
    },
    changeToRegister () {
      this.isLogin = 0
    }
  }

}
</script>

<style scoped lang="less">
#index{
  height: 100%;
  width: 100%;
  #panel{
    height: 40%;
    width: 40%;
  }
  #left{
    height: 50px;
    width: 50px;
    float: left;
  }
  #right{
    height: 50px;
    width: 50px;
    float: left;
  }
  #bottom{
    clear: both;
  }
}
</style>
