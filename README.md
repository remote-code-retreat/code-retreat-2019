# Remote Global Day of the Coderetreat

El [Global Day of the Coderetreat](https://www.coderetreat.org/) consiste en dedicar una jornada completa a la práctica deliberada, centrándose en los principios fundamentales del desarrollo de software y no en completar una funcionalidad concreta. Todo ello con el único objetivo de mejorar nuestras mecánicas de desarrollo, diseño, testing y refactoring. 

El formato del Coderetreat comporta una serie de restricciones que nos auto-imponemos, y que hacen que sea realmente interesante afrontar el desafío que representa. 

Principalmente la actividad del evento se centra en completar múltiples iteraciones de 45 minutos de duración, por parejas y haciendo TDD, de forma que nuestro foco se centre siempre en las formas y no en completar un problema que es bastante complejo ya por si y que sólo nos sirve como hilo conductor del evento: [El juego de la vida de Conway](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).

En 2019, el [Global Day of the Coderetreat](https://www.coderetreat.org/) se organiza a nivel mundial el 16 de Noviembre y, aunque habitualmente los Coderetreat se realizan en un localización física y se hacen "cara a cara", nuestro objetivo es destilar la esencia de este tipo de eventos para trasladala al plano remoto. 

# ¿Cómo puedo participar?

Una de las ventajas de ser un Coderetreat remoto es que no tenemos aforo máximo, por lo que si quieres participar únicamente tienes que completar la inscripción enviándonos un *pull request* con tus datos siguiendo este JSON al directorio `people`:

```json
{
  "nombre": "Tu nombre completo",
  "twitter": "Tu handler de twitter sin la @",
  "ciudad": "Desde que ciudad del mundo te conectarás",
  "dirigir": [ "lenguaje que dominio", "lenguaje que dominio" ],
  "aprender": [ "lenguaje que quiero aprender", "lenguaje que quiero aprender" ]
}
```

# ¿En qué lenguaje se programará?

No hay restricción en cuanto al lenguaje a emplear. En cualquier caso y para facilitar el trabajo a la hora de probar nuevos lenguajes y entornos, os hemos preparado una serie de presets.

- [JavaScript](presets/javascript)
