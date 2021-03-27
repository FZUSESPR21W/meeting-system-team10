<template>
  <div id="viewNotifications">
    <Table :columns="columns" :data="data"></Table>
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
.table {
  text-align: left;
}
.button {
  margin-bottom: 20px;
}

</style>
