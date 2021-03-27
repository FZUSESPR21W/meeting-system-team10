<template>
  <div id="conference">
    <div>test</div>
  </div>
</template>

<script>
export default {
  name: 'Conference',
  props: {
    forumTitle: {
      type: String,
      default: ''
    },
    forumId: {
      type: Number,
      default: 0
    },
    location: {
      type: String,
      default: ''
    },
    time: {
      type: String,
      default: ''
    },
    content: {
      type: Array,
      default: () => []
    }
  }
}
</script>

<style scoped>
#conference{
  width: 90%;
  left: 5%;
  background-color: white;
  border-radius: 10px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
  padding: 40px;
}
</style>
