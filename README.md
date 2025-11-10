[README.md](https://github.com/user-attachments/files/23444746/README.md)
# SalmonttCentre

**SalmonttCentre** es un programa desarrollado en **Java** que modela las entidades fundamentales de la empresa 
salmonera **Salmontt**, ubicada en Puerto Montt, Chile.  

---

👤 **Autor del proyecto**
* **Nombre completo:** Mercedes Malandrino
* **Sección:** DESARROLLO ORIENTADO A OBJETOS I_002A
* **Carrera:** Analista Programador Computacional
* **Sede:** Campus En Línea

---

## 📘 Descripción General

Este proyecto corresponde a la primera fase del proceso de digitalización de los sistemas internos de la compañía, 
buscando mejorar la gestión y organización de la información del personal. Se trata de un **sistema orientado a objetos
(POO)** que representa de forma estructural a los trabajadores de la empresa.

Se utilizan clases definidas que están ordenadas por paquetes, relaciones de **herencia** y **composición**, además de 
**encapsulamiento** de los atributos.

El objetivo de este diseño es que sea extensible y escalable, para ampliarlo en un futuro como módulos de gestión de
empleados, registro de productoos y/o seguimiento logístico o de compra y venta.

---

## 🧱 Estructura general del proyecto

```
salmonttcentre/
📁 src/
├── app/                # Paquete `app` donde guardamos la clase Main.java
  └── Main.java         # Clase principal `Main`
└── model/              # Paquete `model` donde guardamos las clases de dominio  
  └── Persona.java      # Clase `Persona` crea los atributos personales
  └── Empleado.java     # Clase `Empleado` crea los atributos laborales 
  └── Direccion.java    # Clase `Direccion` crea los atributos domiciliares 
```
### 🧠 Paquete: `app`
- **`Main`**: Clase que orquesta y crea instancias de las clases del programa. Muestra los datos en consola utilizando 
el método `toString()`.

### 📦 Paquete: `model`

- **`Persona`**: Clase base que representa a una persona de la empresa, con información personal, de contacto y 
una relación de **composición** con la clase `Direccion`.
- **`Direccion`**: Clase que encapsula los datos de una dirección física (calle, número, ciudad, región).
- **`Empleado`**: Clase que **hereda de `Persona`** y agrega atributos específicos propios de la empresa como cargo, 
fecha de contratación y sueldo.

---
## ⚙️ Instrucciones para compilar y ejecutar la clase Main.
1. Abre IntelliJ.
2. Crea un nuevo **Proyecto Java** y ponle el nombre `SalmonttCentre`.
3. Copia los archivos del proyecto en las carpetas correspondientes:
    * `model` → para las clases `Persona`, `Empleado` y `Direccion`.
    * `app` → para la clase `Main`.
4. Haz click derecho sobre la clase `Main` y busca la opcion: **Run 'Main.main()'**. También puedes ir directamente 
a la pestaña Main.java y en la parte superior derecha dale click al botón verde similar a darle "play" en una radio.
5. Observa como compila el programa a través de la consola en la parte inferior del IDE.
