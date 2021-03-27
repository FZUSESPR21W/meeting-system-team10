<template>
  <div id="viewNotifications">
    <div id="tips">已经发布的通知:</div>
    <Table stripe border :columns="columns" :data="data" id="table_fix"></Table>
    <Button class="button" @click="add">添加</Button>

  </div>
</template>

<script>
export default {
  name: 'viewNotifications.vue',
  data () {
    return {
      columns: [
        {
          title: '发布者',
          key: 'publisher'
        },
        {
          title: '消息',
          key: 'notification',
          render: (h, { row, index }) => {
            return h('Input', {
              props: {
                value: row.notification
              },
              on: {
                'on-blur': (event) => {
                  this.data[index].notification = event.target.value
                  console.log(event.target.value)
                }
              }
            })
          }
        }
      ],
      data: [
        {
          publisher: '铧钦',
          notification: '牛逼'
        }, {
          publisher: '铧钦',
          notification: '牛逼'
        }, {
          publisher: '铧钦',
          notification: '牛逼'
        }, {
          publisher: '铧钦',
          notification: '牛逼'
        }

      ]

    }
  },
  methods: {
    add () {
      const addData = {
        publisher: '',
        notification: ''
      }
      this.data.push(addData)
    }
  }
}
</script>

<style scoped lang="less">
#tips{
  margin-left: 330px;
  font-size: 20px;
  font-weight: bold;
}
/deep/.ivu-table-row {
  background-color: #fff;
  border: 3px solid #000000;
}
.button {
  margin-bottom: 20px;
}

</style>
