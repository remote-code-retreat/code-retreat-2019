# Remote Global Day of the Coderetreat

El [Global Day of the Coderetreat](https://www.coderetreat.org/) consiste en dedicar una jornada completa a la práctica deliberada, centrándose en los principios fundamentales del desarrollo de software y no en completar una funcionalidad concreta. Todo ello con el único objetivo de mejorar nuestras mecánicas de desarrollo, diseño, testing y refactoring.

El formato del Coderetreat comporta una serie de restricciones que nos auto-imponemos, y que hacen que sea realmente interesante afrontar el desafío que representa.

Principalmente la actividad del evento se centra en completar múltiples iteraciones de 45 minutos de duración, por parejas y haciendo TDD, de forma que nuestro foco se centre siempre en las formas y no en completar un problema que es bastante complejo ya por si y que sólo nos sirve como hilo conductor del evento: [El juego de la vida de Conway](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).

En 2019, el [Global Day of the Coderetreat](https://www.coderetreat.org/) se organiza a nivel mundial el 16 de Noviembre y, aunque habitualmente los Coderetreat se realizan en un localización física y se hacen "cara a cara", nuestro objetivo es destilar la esencia de este tipo de eventos para trasladarla al plano remoto.

# ¿Cómo puedo participar?

Una de las ventajas de ser un Coderetreat remoto es que no tenemos aforo máximo, aunque para esta edición vamos a limitarlo a 100 personas. Si quieres participar únicamente tienes que completar la inscripción enviándonos un *pull request* con tus datos siguiendo este JSON al directorio `people`:

```json
{
  "nombre": "Tu nombre completo",
  "twitter": "Tu handler de twitter sin la @",
  "slack": "@TuHandleDeSlack",
  "ciudad": "Desde que ciudad del mundo te conectarás",
  "dirigir": [ "lenguaje que dominio", "lenguaje que dominio" ],
  "aprender": [ "lenguaje que quiero aprender", "lenguaje que quiero aprender" ]
}
```

Vamos a utilizar slack como herramienta de coordinación. Para poder comenzar a utilizarlo, únete [aquí a este Slack](https://join.slack.com/t/remotecoderetreat/shared_invite/enQtNzk0MDA0NDUwMDA0LTJjMDlhYjY0NTQ0NzZkZTk0MTFjYmRkYTYzOGQ1ZDYxMGI5ZGRjMzJkZjRhNThkNDQ4Y2EzZWNmZDQyOGExY2Q).

# ¿En qué lenguaje se programará?

No hay restricción en cuanto al lenguaje a emplear. En cualquier caso y para facilitar el trabajo a la hora de probar nuevos lenguajes y entornos, os hemos preparado una serie de presets.

- [JavaScript](presets/javascript)
- [Java](presets/java)
- [Typescript](presets/typescript)
- [PHP](presets/php)
- [Elm](presets/elm)
- [Elixir](presets/elixir)
- [Python](presets/python)
- [Kotlin](presets/kotlin)
- [Scala](presets/scala)
- [Ruby](presets/ruby)
- [Golang](presets/golang)

¿Tu lenguaje favorito no está entre los presets disponibles? Envíanos un [pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests) y lo incorporaremos a la lista :)

# ¿Qué tengo que tener instalado?

## Visual Studio Code

Para simplificar la interacción entre los asistentes, hemos elegido [Visual Studio Code](https://code.visualstudio.com/) como IDE de referencia a utilizar durante el evento.

El motivo principal es que su extensión [Live Share](https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare) permite la colaboración en tiempo real de una forma sencilla y efectiva.

![Live Share](https://code.visualstudio.com/assets/blogs/2017/11/15/vs-code-ls-session.png)

Podéis encontrar más detalles sobre su funcionamiento [aquí](https://code.visualstudio.com/blogs/2017/11/15/live-share).

Alrededor de Live Share, han surgido otras extensiones. De todas ellas, tambien utilizaremos la de [Live Share Audio](https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare-audio), que nos permite mantener una conversación hablada con nuestra pareja.

Si quieres instalar todas los plugins de Live Share que vamos a utilizar, más alguno que también está bastante bien, puedes hacerlo instalando únicamente el [Live Share Extension Pack](https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare-pack)

## Zoom

Cuando tengamos que hablar todos juntos, utilizaremos [Zoom](https://zoom.us/). Para unirte a la llamada, tendrás que instalar el software, pero no es necesario tener una cuenta.

## Slack

Utilizaremos [Slack](https://slack.com/) como herramienta de coordinación. Consulta los apartados de **¿Cómo puedo participar?** o **¿Cómo nos coordinaremos durante el evento?** para más detalles.

## Cuckoo

Es una web app para medir el tiempo de las iteraciones e intervalos entre ellas.

Al inicio de cada iteración comenzaremos un pomodoro de 45 minutos y al terminar se emite una notificación en el browser.
No se necesita instalar nada, solo abrir esta web, para ver el tiempo que queda hasta la siguiente iteracion:

https://cuckoo.team/remote-code-retreat

Para los periodos de retro después de cada sesión y almuerzo también se lanzara un timer de 15 y 30 minutos respectivamente.

## Resumen

- [Visual Studio Code](https://code.visualstudio.com/)
- [Live Share](https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare)
- [Live Share Audio](https://marketplace.visualstudio.com/items?itemName=MS-vsliveshare.vsliveshare-audio)
- [Zoom](https://zoom.us/)
- [Slack](https://slack.com)

# ¿Qué haremos durante el Remote Coderetreat?

## Iteraciones

Realizaremos varias iteraciones de **45 minutos**, cambiando de pareja y/o lenguaje después de cada iteración. Al finalizar la iteración haremos una mini retrospectiva para poner en común ideas y avances.

## Creación de parejas

Para llevar un control de las parejas creadas en cada iteración hemos creado un [excel compartido en Google Sheets](https://docs.google.com/spreadsheets/d/1BSh9xbjbkV4NSX753qbSqiuC6kwn_1-IkBE2p43FXeo/edit?usp=sharing).

El documento tiene 4 hojas, una por iteración. En cada iteración identificaremos a las personas que van dirigir y a sus parejas utilizando el identificador de usuario de Slack de ambos. Adicionalmente, se indicará para cada pareja el lenguaje en el que van a trabajar y la URL de Visual Studio Code donde se llevará a cabo la sesión.

Es responsabilidad del que dirige el dar de alta su usuario, lenguaje y URL de Visual Studio Code en el documento.

A la hora de definir quien será su pareja durante la iteración, utilizaremos Slack para coordinarnos.

> Si no quieres participar en una sesión de forma directa pero quieres aprender viendo como desarrollan otros, te puedes conectar a la URL de la sesión y asistir como oyente

## Planning

A continuación, podrás encontrar una agenda provisional. Es posible que haya modificaciones durante los días previos al evento, así que consultala de nuevo cuando se acerque el día del evento.

```
08:30 - Configura tu entorno: Slot reservado para configuración y pruebas de conexión
09:00 - Presentación breve y confeccionar parejas
09:30 - Primera iteración
10:15 - Retro
10:30 - Segunda iteración
11:15 - Retro
11:30 - Almuerzo
12:00 - Tercera iteración
12:45 - Retro
13:00 - Cuarta iteración
13:45 - Retro final
```

## Facilitador

El coderetreat será facilitado por [Xavi Gost](https://twitter.com/xav1uzz):

<img src="https://redflag.es/images/team/xavi.jpeg" width="200" />

# ¿Cómo nos coordinaremos durante el evento?

Durante el evento utilizaremos Slack para lanzar avisos y coordinarnos a la hora de cambiar de pareja en cada iteración.

Mantendremos una videollamada utilizando Zoom. La vídeollamada de Zoom estará siempre abierta para que cualquier persona pueda unirse en cualquier momento y la compartiremos a través de Slack.

En Slack se han creado tantos canales como presets hay disponibles. Únete a los que más te interesen para estar informado de problemas de configuración o información interesante relativa a tu lenguaje.

# ¿Qué problema vamos a abordar?

Es costumbre que en los Coderetreats la kata elegida sea el [Juego de la Vida de Conway](https://www.coderetreat.org/pages/facilitating/gol/). Como has podido comprobar en la agenda, no hay un slot concreto para explicar la kata, así que asegúrate de haberla leído y entendido antes del día del evento.

![Reglas del juego de la vida](rules.png)

Tienes una descripción completa de la misma [aquí](https://www.coderetreat.org/pages/facilitating/gol/).

## Reglas básicas

- Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
- Any live cell with more than three live neighbours dies, as if by overcrowding.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any dead cell with exactly three live neighbours becomes a live cell.

# Código de Conducta


Se requiere que todos los asistentes, ponentes y
voluntarios de nuestro evento acepten el siguiente código de
conducta. Los organizadores harán cumplir este código a lo largo del
evento. Esperamos la colaboración de todos los participantes para ayudar a
asegurar un ambiente seguro para todos.


## La Versión Rápida


Nuestro evento se dedica a ofrecer una experiencia libre de abusos
para todos, independientemente de su género, orientación sexual,
discapacidad, apariencia física, talla, raza o religión. No toleramos
abusos de los participantes del evento en ninguna de sus formas. El
lenguaje e imágenes sexuales no son apropiados para ninguna sala del
evento, incluyendo charlas, talleres, Twitter y otros medios
online. Los participantes del evento que violen estas reglas pueden
ser sancionados o expulsados de la misma a discreción de los organizadores.


## La Versión Menos Corta


Los abusos incluyen: comentarios ofensivos relativos a género, orientación
sexual, discapacidad, apariencia física, talla, raza, religión, imágenes
sexuales en espacios públicos, intimidación deliberada, acoso,
persecución, fotografía o grabación de abusos, interrupciones continuadas
de charlas u otros eventos y atención sexual no deseada.

Se espera que los participantes instados a parar cualquier comportamiento
abusivo obedezcan inmediatamente.

Si un participante incurre en un comportamiento abusivo, los organizadores
del evento pueden tomar cualquier acción que estimen oportuna,
incluyendo advertencias al ofensor o su expulsión del evento

Si estás sufriendo algún abuso, adviertes abusos sobre otra persona, o
tienes alguna otra preocupación, por favor contacta con algún miembro del
personal del evento inmediatamente. El personal del evento
puede ser fácilmente identificado, tanto a traves de los miembros de GitHub
como en slack.

El personal del evento estará contento de ayudar a los participantes
a contactar con las autoridades locales, asistir de otra manera a aquellos
que estén sufriendo abusos para que se sientan seguros mientras dure el evento.
Valoramos tu asistencia.

Esperamos que los participantes sigan estas reglas en el evento, talleres y otros
aspectos relacionados con el evento.


Fuente original y créditos (se han realizado modificaciones eliminiando aquellas cosas que no encajan con un evento virtual):

+ [http://2012.jsconf.us/#/about](http://2012.jsconf.us/#/about)

+ [The Ada Initiative](http://geekfeminism.wikia.com/wiki/Conference_anti-harassment/Policy)

Licencia:
[Creative Commons Atribución 3.0 Unported License](http://creativecommons.org/licenses/by/3.0/deed.en_US)
