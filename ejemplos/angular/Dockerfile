FROM node:17-alpine as build-step

RUN mkdir -p /app

WORKDIR /app

RUN pwd

COPY package.json /app

RUN yarn install

COPY . /app

RUN npm run build --prod

FROM nginx:1.21.6-alpine

COPY --from=build-step /app/dist/ /usr/share/nginx/html

EXPOSE 80