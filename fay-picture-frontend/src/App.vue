<template>
  <ConfigProvider :theme="theme">
    <BasicLayout />
  </ConfigProvider>
</template>

<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'
// import { healthUsingGet } from '@/api/mainController.ts'
// import {useLoginUserStore} from "@/stores/useLoginUserStore.ts";

// 已经改为在权限校验文件中获取
// const loginUserStore = useLoginUserStore()
// loginUserStore.fetchLoginUser()

// healthUsingGet().then((res) => {
//   console.log(res)
// })

import { ConfigProvider } from 'ant-design-vue';
import theme from './theme'; // 引入主题配置

</script>

<style scoped></style>
