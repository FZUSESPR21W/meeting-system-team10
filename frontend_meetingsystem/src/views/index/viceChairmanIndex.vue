<template>
  <div id="viceChairmanIndex">
    <div id="chartCss"><Chart/></div>
    <div id="notificationCss"><ViewNotifications/></div>

  </div>
</template>

<script>
import Chart from '@/components/chart/chart.vue'
import ViewNotifications from '@/components/viewNotifications.vue'
export default {
  name: 'viceChairmanIndex',
  components: { ViewNotifications, Chart }
}
</script>

<style scoped lang="less">
#chartCss{
  margin-top: 30px;
  margin-left: 760px;
  width: 800px;
}

#notificationCss{
  width: 800px;
  margin-left: 600px;
}
</style>
