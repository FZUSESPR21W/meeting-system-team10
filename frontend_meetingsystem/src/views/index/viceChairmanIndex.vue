<template>
  <div id="viceChairmanIndex">
    <mainFrame></mainFrame>
    <div id="chartCss"><Chart/></div>
    <div id="notificationCss"><ViewNotifications/></div>
    <div id="background"></div>
  </div>
</template>

<script>
import Chart from '../../components/chart/chart.vue'
import ViewNotifications from '../../components/viewNotifications.vue'
import mainFrame from '../../components/mainFrame.vue'
export default {
  name: 'viceChairmanIndex',
  components: { ViewNotifications, Chart, mainFrame }
}
</script>

<style scoped lang="less">
#chartCss{
  margin-left: 25%;
  width: 50%;
  margin-top: 30px;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 40px;
}

#notificationCss{
  margin-top: 2%;
  margin-left: 25%;
  width: 50%;
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
