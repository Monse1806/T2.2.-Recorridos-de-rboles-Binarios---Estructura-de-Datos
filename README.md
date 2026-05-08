# Recorridos de Árboles Binarios - Estructura de Datos

**Universidad Técnica de Ambato**  
**Carrera:** Ingeniería de Software  
**Asignatura:** Estructura de Datos  
**Curso:** Tercero B  
**Tema:** Recorridos de árboles binarios: Inorden, Preorden, Postorden y BFS

## Objetivo general
Implementar y analizar los principales recorridos de árboles binarios utilizando C++ y Java, aplicando estructuras de datos dinámicas, recursividad y colas.

## Resultados de aprendizaje
Al finalizar la práctica, el estudiante será capaz de:

1. Explicar la diferencia entre recorridos DFS y BFS.
2. Implementar recorridos Inorden, Preorden y Postorden con recursividad.
3. Implementar BFS usando una cola.
4. Comparar la implementación en C++ y Java.
5. Aplicar recorridos de árboles a un caso real del proyecto final.

## Contenido
| Carpeta/Archivo | Descripción |
|---|---|
| `src/cpp/main.cpp` | Implementación completa en C++ (Ejercicios 1 al 5) |
| `src/java/Main.java` | Implementación completa en Java (Ejercicios 1 al 5) |
| `capturas/` | Evidencias de ejecución en C++ y Java |
| `INFORME.pdf` | Informe académico completo de la práctica |
| `docs/` | Guía práctica para la clase |
| `exercises/` | Ejercicios para trabajo grupal |
| `moodle/` | Banco de preguntas tipo Moodle |
| `assets/` | Recursos de apoyo |
## Ejercicios resueltos

| Ejercicio | Descripción |
|-----------|-------------|
| **Ejercicio 1** | Recorridos (Preorden, Inorden, Postorden, BFS) del árbol inicial: 10, 5, 15, 2, 7, 12, 20 |
| **Ejercicio 2** | Árbol modificado con 5 nodos nuevos: 1, 3, 18, 25, 30 |
| **Ejercicio 3** | Función recursiva para contar el total de nodos del árbol |
| **Ejercicio 4** | Función recursiva para contar las hojas del árbol |
| **Ejercicio 5** | Estructura del Sistema Web

## Resultados de ejecución
### Ejercicio 1 - Árbol inicial (10, 5, 15, 2, 7, 12, 20)

| Recorrido | Resultado |
|-----------|-----------|
| Preorden | 10, 5, 2, 7, 15, 12, 20 |
| Inorden | 2, 5, 7, 10, 12, 15, 20 |
| Postorden | 2, 7, 5, 12, 20, 15, 10 |
| BFS | 10, 5, 15, 2, 7, 12, 20 |

### Ejercicio 2 - Árbol con 5 nodos agregados (1, 3, 18, 25, 30)

| Recorrido | Resultado |
|-----------|-----------|
| Preorden | 10, 5, 2, 1, 3, 7, 15, 12, 30, 20, 18, 25 |
| Inorden | 1, 2, 3, 5, 7, 10, 12, 15, 18, 20, 25, 30 |
| Postorden | 1, 3, 2, 7, 5, 30, 12, 25, 18, 20, 15, 10 |
| BFS | 10, 5, 15, 2, 7, 12, 20, 1, 3, 30, 18, 25 |

### Ejercicios 3 y 4

| Función | Resultado |
|---------|-----------|
| Contar nodos | 12 nodos |
| Contar hojas | 5 hojas (1, 3, 7, 25, 30) |
### Ejercicio 5 - Sistema Web (Aplicación al proyecto final)
| Situación | Recorrido | Explicación |
|-----------|-----------|-------------|
| Mostrar el menú principal | **Preorden** | Muestra primero la raíz (Sistema Web) y luego los submódulos |
| Procesar módulos internos | **Postorden** | Procesa los hijos (Registrar, Buscar, etc.) antes que los padres |
| Mostrar nivel por nivel | **BFS** | Recorre el árbol por niveles: Nivel 0, Nivel 1, Nivel 2 |

## Reglas de recorrido
| Recorrido | Orden |
|---|---|
| Inorden | Izquierda → Raíz → Derecha |
| Preorden | Raíz → Izquierda → Derecha |
| Postorden | Izquierda → Derecha → Raíz |
| BFS | Nivel por nivel usando cola |

## Ejecución en C++

```bash
cd src/cpp
g++ main.cpp -o recorridos
./recorridos
```

## Ejecución en Java

```bash
cd src/java
javac Main.java
java Main
```

