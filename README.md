# CS 320 – Portafolio de pruebas de software

## Descripción del proyecto

Este repositorio contiene mi portafolio del curso CS 320: Pruebas de software, automatización y aseguramiento de la calidad. Incluye el proyecto Contact Service desarrollado en Java, sus pruebas unitarias con JUnit y el informe de síntesis y reflexión sobre las prácticas de pruebas de software y la calidad del código.

## 1. ¿Cómo me aseguro de que mi código, programa o software sea funcional y seguro?

Me aseguro de que el software funcione correctamente revisando los requisitos y creando pruebas unitarias con JUnit. Pruebo tanto los datos válidos como los inválidos, los límites establecidos y el manejo de errores. También reviso el código para identificar posibles riesgos de seguridad y valido los datos para evitar comportamientos inesperados. Estas prácticas ayudan a detectar errores y mejorar la calidad del software.

## 2. ¿Cómo interpreto las necesidades de los usuarios y las incorporo en un programa?

Primero reviso cuidadosamente los requisitos para comprender qué necesita el usuario y cómo debe comportarse el programa. Después convierto esos requisitos en funcionalidades específicas y casos de prueba. Por ejemplo, en el proyecto Contact Service, los datos de contacto deben cumplir límites de longitud y formato, y los identificadores deben ser únicos e inmutables. De esta manera, el desarrollo y las pruebas se orientan a cumplir las necesidades del usuario.

## 3. ¿Cómo abordo el diseño de software?

Abordo el diseño de software dividiendo el problema en componentes pequeños con responsabilidades claras. Procuro escribir código organizado, fácil de leer y mantener, que cumpla con los requisitos establecidos. También considero cómo interactúan las clases y los métodos, cómo manejar los datos inválidos y cómo comprobar el funcionamiento de cada componente mediante pruebas unitarias. Este enfoque facilita encontrar errores y realizar cambios futuros.

## Contenido del portafolio

- `Contact.java`: clase que representa los datos de un contacto.
- `ContactService.java`: clase que administra las operaciones de contactos.
- `ContactTest.java`: pruebas unitarias de la clase Contact.
- `ContactServiceTest.java`: pruebas unitarias de ContactService.
- Informe de síntesis y reflexión: documento sobre las prácticas de pruebas de software y los aprendizajes del curso.

## Reflexión sobre lo aprendido

Este curso me ayudó a comprender la importancia de las pruebas unitarias, la validación de datos, las pruebas de límites y la automatización con JUnit. Aprendí que la calidad del software no depende solamente de que el programa se ejecute, sino también de que cumpla los requisitos, gestione correctamente las entradas inválidas y mantenga un comportamiento confiable.
