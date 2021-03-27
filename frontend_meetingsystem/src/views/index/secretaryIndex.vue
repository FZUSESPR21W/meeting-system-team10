<template>
  <div id="secretaryIndex">
    <div id="chartCss"><Chart/></div>
    <div id="notificationCss"><ViewNotifications/></div>
    <div id="secretaryCss"><viewMembers/></div>
  </div>
</template>

<script>
import Chart from '../../components/chart/chart.vue'
import ViewNotifications from '../../components/viewNotifications.vue'
import viewMembers from '../../components/secretary/viewMembers.vue'
export default {
  name: 'secretaryIndex',
  components: {
    Chart, ViewNotifications, viewMembers
  }
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
#secretaryCss{
  margin-top: 2%;
  margin-left: 25%;
  width: 50%;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 40px;
}
</style>
