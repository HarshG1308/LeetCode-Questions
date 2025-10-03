class Solution(object):
    def trapRainWater(self, heightMap):
        if not heightMap or not heightMap[0]:
            return 0
        m, n = len(heightMap), len(heightMap[0])
        visited = [[False]*n for _ in range(m)]
        heap = []

        # push all boundary cells
        for i in range(m):
            for j in [0, n-1]:
                visited[i][j] = True
                heapq.heappush(heap, (heightMap[i][j], i, j))
        for j in range(n):
            for i in [0, m-1]:
                if not visited[i][j]:
                    visited[i][j] = True
                    heapq.heappush(heap, (heightMap[i][j], i, j))

        water = 0
        dirs = [(1,0),(-1,0),(0,1),(0,-1)]

        while heap:
            h, x, y = heapq.heappop(heap)
            for dx, dy in dirs:
                nx, ny = x + dx, y + dy
                if 0 <= nx < m and 0 <= ny < n and not visited[nx][ny]:
                    visited[nx][ny] = True
                    nh = heightMap[nx][ny]
                    if nh < h:
                        water += (h - nh)
                    # push neighbor with effective height
                    heapq.heappush(heap, (max(nh, h), nx, ny))

        return water
            