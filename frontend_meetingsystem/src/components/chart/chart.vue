<template>
  <div >
    <div id="myChart" :style="{width: '500px', height: '300px'}"></div>
  </div>
</template>

<script>
const echarts = require('echarts')
export default {
  name: 'chart.vue',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      data1: ['人工智能', '机器学习', '算法', '大数据', '仿生学', '嵌入式'],
      data2: [5, 20, 36, 10, 10, 20]
    }
  },
  methods: {
    drawLine () {
      // 基于准备好的dom，初始化echarts实例
      const myChart = echarts.init(document.getElementById('myChart'))
      // 绘制图表
      myChart.setOption({
        title: {
          text: '各分论坛参与人数'
          // textAlign: 'center',
          // padding: 0
        },
        tooltip: {},
        xAxis: {
          data: this.data1
        },
        yAxis: {},
        series: [{
          name: '参与人数',
          type: 'bar',
          data: this.data2
        }],
        legend: {
          selected: {
            销量: true // ----图例选择,图形加载出来会显示选择的图例，默认为true
          },
          textStyle: { // ----图例内容样式
            color: '#fff' // ---所有图例的字体颜色
            // backgroundColor:'black',  //---所有图例的字体背景色
          },
          tooltip: { // 图例提示框，默认不显示
            show: true,
            color: 'red'
          },
          data: [ // ----图例内容
            {
              name: '销量',
              icon: 'circle', // ----图例的外框样式
              textStyle: {
                color: '#fff' // ----单独设置某一个图例的颜色
                // backgroundColor:'black',//---单独设置某一个图例的字体背景色
              }
            }
          ]
        }

      })
    },
    getInfo () {
      this.$axios.post('http://120.26.60.194:8080/message/search')
        .then(res => {
          this.data1 = res.data.x
          this.data2 = res.data.y
          console.log(this.data1)
          this.drawLine()
        }).catch(error => {
          console.log(error)
          this.$Message.error('Login Fail!')
        })
    }
  },
  mounted () {
    // console.log('fdfdsfds')
    this.$nextTick(this.drawLine())
    this.getInfo()
  },
  updated () {
    // console.log('fdfdsfds')
    this.drawLine()
  }
}
</script>

<style scoped lang="less">

</style>
