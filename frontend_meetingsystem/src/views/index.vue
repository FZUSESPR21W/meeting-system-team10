<template>
  <div id="index">
    <mainFrame></mainFrame>
    <img id="logo" src="../assets/logo.png" alt=""/>
    <div id="panel">
      <div style="display: flex;justify-content: center; margin-bottom: 30px;margin-top: 15px">
        <span class="tab" @click="changeToLogin">{{$t('index.login')}}</span>
        <span class="tab" @click="changeToRegister">{{$t('index.register')}}</span>
      </div>
      <div v-if="isLogin===1">
        <Login/>
      </div>
      <div v-else>
        <Register/>
      </div>
    </div>
    <div id="background"></div>
  </div>
</template>

<script>

import Login from '@/components/index/login'
import Register from '@/components/index/register'
import mainFrame from '@/components/mainFrame.vue'

export default {
  name: 'index',
  data () {
    return {
      isLogin: 1
    }
  },
  components: {
    Login,
    Register,
    mainFrame
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

#index {
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
}

#logo{
  position: relative;
}

#background {
  position: fixed;
  background-image: url("../assets/login_background.jpg");
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  z-index: -2;
}

#panel {
  //position: absolute;

  transform: translate(-50% -50%);
  width: 400px;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 0 40px;
  z-index: 50;
}

.tab {
  color: #999999;
  font-size: 15px;
  font-weight: 800;
  margin: 10px;
  cursor: pointer;
  transition: all 0.3s ease-in-out;
}

.tab:hover {
  color: #2a4766;;
}

</style>
