# language: es
# Feature: Automatización del formulario Text Box de demoqa.com
# Este feature describe el escenario de llenado y envío del formulario.

Característica: Llenar el formulario de Text Box
  Como usuario
  Quiero ingresar mis datos en el formulario
  Para verificar que se envía correctamente

  Escenario: Llenar y enviar el formulario
    Dado que estoy en la página de Text Box
    Cuando ingreso los datos requeridos
      | nombre      | email              | dirección      | dirección2      |
      | Juan Perez  | juan@mail.com      | Calle 123      | Piso 2, Local B |
    Y envío el formulario
    Entonces veo los datos ingresados en la confirmación
