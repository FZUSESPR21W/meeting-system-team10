<template>
  <div id="chairmanIndex">
    <mainFrame></mainFrame>
    <chart id="chairmanCss"/>
    <div id="background"></div>
  </div>

</template>

<script>
import chart from '../../components/chart/chart.vue'
import mainFrame from '../../components/mainFrame.vue'
export default {
  name: 'chairmanIndex',
  data () {
    return {
    }
  },
  method: {
  },
  components: {
    chart: chart,
    mainFrame
  }
}
</script>

<style scoped lang="less">
#chairmanCss{
  width: 50%;
  margin-top: 10%;
  margin-left: 25%;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 40px;
}
#background {
  position: fixed;
  background-image: url("../../assets/login_background.jpg");
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  z-index: -2;
}
</style>
