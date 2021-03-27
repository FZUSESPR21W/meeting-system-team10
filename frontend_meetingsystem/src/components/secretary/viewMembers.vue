<template>
  <Table border :columns="columns1" :data="data1" id="viewMembers" ></Table>
</template>

<script>
export default {
  // name: 'viewMembers.vue',
  data () {
    return {
      columns1: [
        {
          title: '姓名',
          key: 'name'
        },
        {
          title: '联系方式',
          key: 'phone'
        }
      ],
      data1: [
        {
          name: 'Kobe Bryant',
          phone: '123456789'
        },
        {
          name: 'LeBron James',
          phone: '987654321'
        }
      ]
    }
  },
  methods: {
    getInfo () {
      this.$axios.post('/api/SelectForumController/selectForum', {
        params: {
          account: window.localStorage.getItem('account')
        }
      })
        .then(res => {
          this.data = res.data[0].jsonArray
        }).catch(error => {
          console.log(error)
          this.$Message.error('getInfo Fail!')
        })
    }
  },
  mounted () {
    this.getInfo()
  }
}
</script>

<style scoped lang="less">

</style>
