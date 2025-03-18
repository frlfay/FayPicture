<template>
  <div class="image-skeleton" :style="{ height: `${height}px`, width: width }">
    <div class="skeleton-animation"></div>
    <div v-if="showIcon" class="skeleton-icon">
      <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
        <path
          d="M8.5 8.5a2 2 0 100-4 2 2 0 000 4z"
          fill="rgba(160, 160, 160, 0.5)"
        ></path>
        <path
          fill-rule="evenodd"
          clip-rule="evenodd"
          d="M6.5 15.5l3.5-3.5 2.5 2.5 4.5-4.5 3 3v2.5h-13.5v-0.5z"
          fill="rgba(160, 160, 160, 0.5)"
        ></path>
        <rect
          x="3.5"
          y="3.5"
          width="17"
          height="17"
          rx="3"
          stroke="rgba(160, 160, 160, 0.5)"
          stroke-width="1.5"
        ></rect>
      </svg>
    </div>
  </div>
</template>

<script setup lang="ts">
defineProps({
  height: {
    type: Number,
    default: 180
  },
  width: {
    type: String,
    default: '100%'
  },
  showIcon: {
    type: Boolean,
    default: true
  }
})
</script>

<style scoped>
.image-skeleton {
  position: relative;
  border-radius: 8px;
  overflow: hidden;
  background-color: #f5f5f5;
}

.skeleton-animation {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background: linear-gradient(90deg, #f0f0f0, #f8f8f8, #f0f0f0);
  background-size: 200% 100%;
  animation: shimmer 1.5s infinite;
}

.skeleton-icon {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 40px;
  height: 40px;
}

@keyframes shimmer {
  0% {
    background-position: 100% 0;
  }
  100% {
    background-position: -100% 0;
  }
}
</style> 