# Patrón de Diseño: Prototype

## Introducción

El patrón de diseño **Prototype** es un patrón creacional utilizado para crear nuevos objetos mediante la clonación de una instancia existente conocida como prototipo. Esto es útil cuando la configuración inicial de un objeto es costosa o compleja.

## Propósito

El propósito principal del patrón Prototype es permitir la creación de objetos a través de la clonación de un prototipo en lugar de construir un objeto nuevo desde cero, lo que puede ser más eficiente y flexible.

## Motivación

En situaciones donde la creación de un objeto requiere de una configuración costosa o compleja, como inicializar estados o establecer configuraciones, el patrón Prototype permite crear una "plantilla" o prototipo que puede ser clonada, minimizando así los costos de creación y simplificando el proceso.

## Estructura

1. **Cloneable (Prototipo)**: Interfaz que declara el método de clonación.
- Character
   
2. **ConcretePrototype (Prototipo Concreto)**: Implementa el método de clonación para crear una copia de sí mismo.
- Soldier
- Archer
- Hero 

3. **Client (Cliente)**: Solicita la clonación del objeto prototipo para recibir nuevas instancias.
4. **CharacterMapCache (Almacén de personajes)**: facilita el acceso a los objetos instanciados mediante el uso de una caché simulada por un hashmap.
