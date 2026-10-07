package com.juanmanueltorresvillota.taller_clase06

val elementos = listOf(
    Elemento(
        id = 1,
        titulo = "Alan Wake 2",
        categoria = "Survival Horror / Terror psicológico.",
        descripcionCorta = "Un thriller de terror psicológico que alterna entre la investigación del FBI y la pesadilla de un escritor.",
        descripcionLarga = "La historia se desarrolla en dos realidades paralelas: por un lado, la investigadora del FBI Saga Anderson, que investiga una serie de asesinatos rituales, y por otro, el escritor Alan Wake, atrapado en una dimensión oscura intentando reescribir su realidad para escapar. El juego enfatiza la atmósfera opresiva, la gestión de recursos y el combate táctico contra fuerzas sobrenaturales."
    ),
    Elemento(
        id = 2,
        titulo = "Red Dead Redemption 2",
        categoria = "Acción y Aventura (Mundo abierto) / Western.",
        descripcionCorta = "Una épica del salvaje oeste sobre la lealtad, la redención y el fin de una era de forajidos.",
        descripcionLarga = "Precuela del clásico de 2010, sigue a Arthur Morgan y a la banda de Dutch van der Linde en 1899, mientras huyen de la ley a través de una América en plena transformación . Es un juego de mundo abierto con un nivel de detalle extremo, donde la simulación de la vida salvaje, las interacciones dinámicas con los NPC y un sistema de honor moral influyen directamente en la narrativa y en cómo te percibe el mundo."
    ),
    Elemento(
        id = 3,
        titulo = "The Last of Us",
        categoria = "Acción y Aventura / Survival Horror.",
        descripcionCorta = "Un viaje desgarrador sobre la supervivencia y el vínculo humano en un mundo post-pandémico.",
        descripcionLarga = "Naughty Dog combina acción, exploración y sigilo en un escenario donde un hongo parasitario ha devastado la civilización . La historia sigue a Joel, un contrabandista endurecido, y a Ellie, una adolescente inmune, mientras cruzan unos Estados Unidos en ruinas. Su mayor fortaleza es la narrativa cinematográfica y la tensión de un combate donde los recursos son extremadamente escasos y cada disparo cuenta."
    ),
    Elemento(
        id = 4,
        titulo = "Bloodborne",
        categoria = "RPG de Acción / Soulslike / Terror Gótico.",
        descripcionCorta = "Un descenso a la locura y el horror cósmico en una ciudad victoriana maldita.",
        descripcionLarga = "Desarrollado por FromSoftware, abandona los escudos de Dark Souls para premiar un combate agresivo y veloz. Ambientado en Yharnam, una ciudad gótica consumida por una plaga que transforma a sus habitantes en bestias, el juego mezcla acción frenética con una atmósfera de terror lovecraftiano. La exploración laberíntica y los intrincados jefes son señas de identidad del estudio."
    ),
    Elemento(
        id = 5,
        titulo = "Uncharted 4: El final de un ladron",
        categoria = "Acción y Aventura / Plataformas y Disparos.",
        descripcionCorta = "La última gran aventura del cazatesoros Nathan Drake, con un enfoque más personal y maduro.",
        descripcionLarga = "Naughty Dog cierra la saga de Nathan Drake llevándolo a una búsqueda del tesoro de Henry Avery, pero con un giro: la historia se centra en su relación con su hermano Sam y en la crisis personal de Nate al dejar atrás su vida de ladrón. Combina tiroteos en tercera persona, secciones de plataformas trepidantes y puzles, todo con un acabado visual y narrativo de primer nivel."
    ),
    Elemento(
        id = 6,
        titulo = "Hollow Knight",
        categoria = "Metroidvania / Acción y Plataformas 2D.",
        descripcionCorta = "Una aventura indie desafiante y atmosférica en el oscuro reino subterráneo de Hallownest.",
        descripcionLarga = "Este aclamado título independiente de Team Cherry te pone en control de un caballero silencioso que explora un vasto y melancólico mundo de insectos. Es un metroidvania puro: un mapa interconectado que se expande al obtener nuevas habilidades, con un combate preciso y exigente, y una historia contada a través del entorno y los personajes que encuentras."
    ),
    Elemento(
        id = 7,
        titulo = "Dark Souls",
        categoria = "RPG de Acción / Soulslike.",
        descripcionCorta = "El título que definió un género, famoso por su atmósfera desoladora y su brutal dificultad.",
        descripcionLarga = "Obra de FromSoftware, sumerge al jugador en un mundo de fantasía oscura llamado Lordran, donde la maldición de los no-muertos se extiende. Su diseño de niveles es legendario, con atajos que conectan zonas de forma magistral. El combate es lento, táctico y castiga el error, obligando al jugador a aprender de cada muerte para progresar en un mundo interconectado."
    ),
    Elemento(
        id = 8,
        titulo = "Sekiro: Shadows Die Twice",
        categoria = "Acción y Aventura / Soulslike",
        descripcionCorta = "Un desafiante juego de acción y sigilo en un Japón feudal fantástico, centrado en el combate con katanas.",
        descripcionLarga = "Dirigido por Hidetaka Miyazaki, se aleja del RPG tradicional para enfocarse en un protagonista único, el Lobo de un solo brazo, con un brazo protésico personalizable . El combate es más vertical y se basa en el choque de espadas y la postura, premiando la agresividad y la defensa precisa (parry) en lugar de la gestión de stamina. Incluye mecánicas de resurrección y un fuerte componente de sigilo."
    ),
    Elemento(
        id = 9,
        titulo = "Hotline Miami",
        categoria = "Acción / Shooter Top-Down.",
        descripcionCorta = "Un juego de acción ultra-violento, frenético y con una estética neon de los años 80.",
        descripcionLarga = "Es un shooter con vista cenital donde un solo golpe (tuyo o del enemigo) es letal. El objetivo es limpiar cada nivel de matones rusos utilizando cualquier arma disponible, desde puños hasta escopetas, en ráfagas de acción rápida y coreografiada. Tiene un componente estratégico (planificar la entrada) y una historia misteriosa y perturbadora."
    ),
    Elemento(
        id = 10,
        titulo = "Persona 5 Royal",
        categoria = "JRPG / Simulación Social.",
        descripcionCorta = "Un JRPG estiloso sobre un grupo de adolescentes que roban los corazones corruptos de los adultos.",
        descripcionLarga = "Es la versión definitiva del aclamado RPG de Atlus. La vida de un estudiante de instituto en Tokio se divide en dos: de día, asistes a clase, trabajas y forjas vínculos con personajes (Simulación Social); de noche, te adentras en palacios mentales (Mazmorras) para combatir por turnos usando \"Personas\", manifestaciones de tu psique. Royal añade personajes, mecánicas y una historia extendida."
    ),
    Elemento(
        id = 11,
        titulo = "Detroit: Become Human",
        categoria = "Aventura Narrativa.",
        descripcionCorta = "Un drama interactivo sobre la consciencia y los derechos de los androides en un futuro cercano.",
        descripcionLarga = "Obra de Quantic Dream, es un thriller narrativo donde cada decisión que tomas altera el curso de la historia. Controlas a tres androides (Kara, Connor y Markus) cuyos caminos se entrelazan en una Detroit futurista donde los androides han comenzado a sentir emociones y a rebelarse contra sus amos humanos. El juego es famoso por su enorme árbol de decisiones ramificado."
    ),
    Elemento(
        id = 12,
        titulo = "Undertale",
        categoria = "RPG / Indie.",
        descripcionCorta = "Un RPG indie encantador y subversivo donde puedes decidir no matar a nadie.",
        descripcionLarga = "Creado por Toby Fox, es un juego de rol con combate por turnos que parodia y homenajea a los clásicos del género. Su gran particularidad es que puedes resolver todos los encuentros sin violencia: en lugar de atacar, puedes interactuar, coquetear o consolar a los monstruos para perdonarles la vida. Esta elección afecta drásticamente la historia y el final, ofreciendo una experiencia narrativa única sobre la empatía."
    ),


)