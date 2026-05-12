# Gitflow-Anthony-Sebastian2
Nosotros hemos decidido usar gitflow para tener mas control en los proyectos
ya que trunk based development es demasiado caotico


# Naming de los branch
MAIN      : El proyecto en su etapa estable 
HOTFIX    : Actualizaciones urgentes que pasaron a main y deben ser corregidas urgentemente
DEVELOP   : Actualizaciones para mantenimiento y validacion de nuevas caracteristicas
FEATURE   : Desarrollo de nuevas caracteristicas


# Estrategias de Revision
Los moderadores del codigo miran los cambios y los comparan con la rama main actual.
Si funcionan sin errores en varios dispositivos y distintos dias se le da el visto bueno y se aprueba para ir a main


# Flujos De Merge
si se trata de una actualizacion normal deberia pasar por
DEVELOP-MAIN

si se desarrolla una nueva modalidad deberia ser
FEATURE-DEVELOP-MAIN

y en el caso de que alguna de las actualizaciones que pasaron por main tiene un error se debe hacer un arreglo rapido por lo cual se debe pasar por
HOTFIX-MAIN
