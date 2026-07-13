# Gitflow-Anthony-Sebastian2

## Descripción

Este proyecto corresponde a una aplicación desarrollada con **Spring Boot** siguiendo la metodología **GitFlow** para el control de versiones y un flujo de trabajo colaborativo. Además, implementa **Docker**, **GitHub Actions** y **AWS EC2** para automatizar el proceso de integración y despliegue continuo (CI/CD).

---

# Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- MySQL
- Docker
- Docker Compose
- Git
- GitHub
- GitHub Actions
- AWS EC2 (Amazon Linux 2023)

---

# Estrategia GitFlow

Se decidió utilizar **GitFlow** para mantener un mejor control del desarrollo del proyecto y facilitar el trabajo colaborativo.

## Ramas utilizadas

- **main:** versión estable del proyecto.
- **develop:** integración y validación de nuevas funcionalidades.
- **feature/\*:** desarrollo de nuevas características.
- **hotfix/\*:** corrección de errores críticos detectados en producción.

---

# Flujo de trabajo

Actualización normal:

```
develop → main
```

Nueva funcionalidad:

```
feature → develop → main
```

Corrección urgente:

```
hotfix → main
```

---

# Estrategia de revisión

Antes de integrar cambios a la rama principal, estos son revisados por el equipo para verificar:

- Correcto funcionamiento.
- Ausencia de errores.
- Compatibilidad con el proyecto.
- Cumplimiento de los estándares establecidos.

---

# Docker

El proyecto utiliza Docker para facilitar el despliegue de la aplicación.

Se incluyen:

- Dockerfile
- Docker Compose

Los servicios utilizados son:

- Aplicación Spring Boot
- Base de datos MySQL
- SonarQube

---

# Integración y Despliegue Continuo (CI/CD)

Se implementó un pipeline utilizando **GitHub Actions**.

El proceso automatiza:

- Compilación del proyecto.
- Construcción de la aplicación.
- Construcción de la imagen Docker.
- Despliegue automático en una instancia **AWS EC2**.

Cada vez que se realiza un **push** a la rama **main**, GitHub Actions ejecuta automáticamente el proceso de despliegue.

---

# Despliegue

El proyecto se encuentra desplegado en:

- Amazon EC2
- Amazon Linux 2023
- Docker

---

# Repositorio

https://github.com/Redsywiwi/Gitflow-Anthony-Sebastian2

---

# Autor

Anthony Romero y SEBASTIAN ANTONIO OLIVARES RIVEROS
