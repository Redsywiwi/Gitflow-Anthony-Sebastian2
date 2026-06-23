# Gitflow-Anthony-Sebastian2
Nosotros hemos decidido usar gitflow para tener mas control en los proyectos ya que trunk based development es demasiado caotico

# Naming de los branch
* **MAIN**: El proyecto en su etapa estable 
* **HOTFIX**: Actualizaciones urgentes que pasaron a main y deben ser corregidas urgentemente
* **DEVELOP**: Actualizaciones para mantenimiento y validacion de nuevas caracteristicas
* **FEATURE**: Desarrollo de nuevas caracteristicas

# Estrategias de Revision
Los moderadores del codigo miran los cambios y los comparan con la rama main actual. Si funcionan sin errores en varios dispositivos y distintos dias se le da el visto bueno y se aprueba para ir a main

# Flujos De Merge
* Si se trata de una actualizacion normal deberia pasar por: **DEVELOP -> MAIN**
* Si se desarrolla una nueva modalidad deberia ser: **FEATURE -> DEVELOP -> MAIN**
* En el caso de que alguna de las actualizaciones que pasaron por main tiene un error se debe hacer un arreglo rapido por lo cual se debe pasar por: **HOTFIX -> MAIN**

# Infraestructura y Orquestación (Kubernetes)
El proyecto ha evolucionado para utilizar **Kubernetes** como orquestador de contenedores en entornos de producción, gestionando de forma automatizada:
* Aplicación Spring Boot (Microservicio)
* Base de datos MySQL

*(Nota: Se mantiene soporte local alternativo mediante Docker Compose para desarrollo rápido).*

# Integración Continua (GitHub Actions)
GitHub Actions automatiza el pipeline de despliegue mediante las siguientes fases:
* Compilación y empaquetado con Java 21 y Maven.
* Pruebas unitarias automatizadas con reportes de cobertura (JaCoCo).
* Análisis de calidad y seguridad estática mediante **SonarQube Scan**.
* Control de calidad automatizado (**Quality Gate Check**) para frenar el pipeline ante fallas.
* Construcción de imágenes Docker y validación de manifiestos.

---

## 📊 Documentación de Observabilidad y Toma de Decisiones Técnicas (Indicador IE4)

Para garantizar la estabilidad, disponibilidad y escalabilidad de la plataforma de "Juegos", se ha implementado una estrategia de observabilidad basada en tres pilares técnicos:

1. **Monitoreo de Infraestructura y Disponibilidad (Spring Boot Actuator & Prometheus):**
   * **Decisión Técnica:** El endpoint `/actuator/health` permite que el clúster de Kubernetes determine de forma automatizada si el contenedor está saludable. Si un microservicio presenta fallas críticas, Kubernetes destruye el contenedor defectuoso y levanta uno nuevo sin interrumpir el servicio al usuario.
   * **Monitoreo de Carga:** El endpoint `/actuator/prometheus` expone métricas en tiempo real de consumo de memoria y CPU. Esto fundamenta las políticas de autoescalado horizontal (HPA), decidiendo técnicamente cuándo duplicar los pods para absorber picos de tráfico.

2. **Políticas de Cumplimiento y Seguridad Estática (SonarQube):**
   * **Decisión Técnica:** El escaneo estático automatizado analiza el código fuente en cada `push` o `pull request`. Si se detecta una vulnerabilidad crítica o una degradación en la cobertura de pruebas (JaCoCo), el *Quality Gate* interrumpe el pipeline inmediatamente. Esto impide de forma estricta que código defectuoso o inseguro llegue a producción.

3. **Métricas de Rendimiento de la Base de Datos:**
   * **Decisión Técnica:** Al capturar la telemetría de conexiones activas hacia la base de datos MySQL, el equipo de ingeniería puede tomar la decisión informada de optimizar consultas (queries ralentizadas) o incrementar el tamaño del pool de conexiones antes de que ocurra una denegación de servicio.

4. **Visualización Centralizada (Dashboards de Métricas - IE3):**
   * **Decisión Técnica:** Se ha estructurado un dashboard en Grafana (`k8s/grafana-dashboard.yaml`) que unifica la telemetría del proceso CI/CD (duración del pipeline y cobertura de JaCoCo obtenida desde SonarQube) con las métricas de rendimiento en producción (consumo de CPU, memoria y tasa de errores HTTP 5xx capturadas por Prometheus). Esto permite al equipo evaluar de un solo vistazo si una degradación del sistema se debe a un despliegue reciente o a una sobrecarga de infraestructura.
