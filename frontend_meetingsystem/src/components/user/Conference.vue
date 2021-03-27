<template>
  <div class="conference">
    <img class="picture" src="../../assets/locations/location2.jpeg">
    <div class="title">{{ this.forumTitle }}</div>
    <div class="location">{{ this.location }}</div>
    <div class="time">{{this.time}}</div>
    <div class="content" v-for="content in contents" :key=content>{{content}}</div>
  </div>
</template>

<script>
export default {
  name: 'Conference',
  props: {
    pictureUrl: {
      type: String,
      default: ''
    },
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
    contents: {
      type: Array,
      default: () => []
    }
  },
  data: function () {
    return {
    }
  }
}
</script>

<style scoped>
.conference{
  width: 80%;
  margin-left: 10%;
  margin-top: 30px;
  margin-bottom: 30px;
  padding-bottom: 30px;
  background-color: white;
  border-radius: 5px;
  box-shadow: 0 5px 20px rgba(25, 25, 25, .75);
}

.picture{
  position: relative;
  border-radius: 5px;
  top: 0;
  width: 100%;
  height: 30%;
}

.title{
  margin-left: 10px;
  font-size: 35px;
  font-weight: bold;
  margin-top: 20px;
  color: black;
}

.location{
  margin-left: 10px;
  font-weight: bold;
  font-size: 25px;
  margin-top: 20px;
}

.time{
  margin-left: 10px;
  font-weight: bold;
  font-size: 25px;
  margin-top: 20px;
}

.content{
  margin-left: 10px;
  font-size: 20px;
  margin-top: 20px;
}

</style>
