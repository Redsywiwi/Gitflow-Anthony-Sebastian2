# 1. Le decimos a Docker que use Node.js
FROM node:18

# 2. Creamos una carpeta dentro de Docker para guardar el proyecto
WORKDIR /app

# 3. Copiamos los archivos que dicen qué librerías usa tu proyecto
COPY package*.json ./

# 4. Instalamos esas librerías dentro de Docker
RUN npm install

# 5. Copiamos todo el resto de tu código
COPY . .

# 6. Decimos en qué puerto va a funcionar (ejemplo: el 3000)
EXPOSE 3000

# 7. El comando para encender tu aplicación
CMD ["npm", "start"]