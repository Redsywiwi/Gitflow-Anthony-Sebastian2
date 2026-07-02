# Usa una imagen base de Node.js
FROM node:18

# Define el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos de dependencias primero
COPY package*.json ./

# Instala las dependencias
RUN npm install

# Copia TODO el resto del código fuente
COPY . .

# Expone el puerto (ajústalo si tu app usa otro)
EXPOSE 3000

# Comando para iniciar la aplicación
CMD ["npm", "start"]