<template>
  <div id="viceChairmanIndex">
    <mainFrame></mainFrame>
    <div id="chartCss"><Chart/></div>
    <div id="notificationCss"><ViewNotifications/></div>

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

  margin-top: 30px;
  margin-left: 760px;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 40px;
}

#notificationCss{
  width: 800px;
  margin-left: 600px;
}
</style>
