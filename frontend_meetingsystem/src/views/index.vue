<template>
  <viewMembers></viewMembers>
</template>

<script>
import viewMembers from '../components/secretary/viewMembers'

export default {
  name: 'index',
  data () {
    return {
      isLogin: 1
    }
  },
  components: {
    viewMembers
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
