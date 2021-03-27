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
  }
}
</script>

<style scoped lang="less">

</style>
