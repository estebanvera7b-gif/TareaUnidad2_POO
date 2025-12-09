# Sistema de Gestión de Contenidos Audiovisuales

Este proyecto es una implementación práctica de los conceptos avanzados de **Programación Orientada a Objetos (POO)** en Java, desarrollada como parte de la Tarea de la Unidad 2.

El sistema permite modelar y gestionar diferentes tipos de contenidos audiovisuales (Películas, Series, Documentales) estableciendo relaciones sólidas entre clases mediante Herencia, Agregación, Composición y Asociación.

## 📋 Características y Funcionalidades

El proyecto extiende un sistema base incorporando las siguientes funcionalidades:

* **Gestión de Películas:** Vinculación de **Actores** mediante relaciones de agregación.
* **Gestión de Series de TV:** Administración de **Temporadas** mediante relaciones de composición (una serie se compone de temporadas).
* **Gestión de Documentales:** Asociación de **Investigadores** a temas específicos.
* **Extensibilidad:** Se añadieron nuevas subclases (`Cortometraje`, `VideoYouTube`) demostrando el uso de herencia.

## 🛠️ Estructura del Proyecto (Clases)

El proyecto contiene las siguientes clases organizadas en el paquete `uni1a`:

1.  **ContenidoAudiovisual** (Superclase abstracta)
2.  **Pelicula** (Extiende ContenidoAudiovisual) + Clase **Actor**
3.  **SerieDeTV** (Extiende ContenidoAudiovisual) + Clase **Temporada**
4.  **Documental** (Extiende ContenidoAudiovisual) + Clase **Investigador**

## 🚀 Instalación y Ejecución

Sigue estos pasos para probar el proyecto en tu máquina local:

### 1. Clonar el repositorio
Abre tu terminal o Git Bash y ejecuta:
```bash

git clone [https://github.com/estebanvera7b-gif/TareaUnidad2_POO.git]
