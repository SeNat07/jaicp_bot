require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        random:
            a: Здравствуйте!
            a: Добрый день!
            a: Приветствую!
        a: Давайте я помогу вам купить билеты на самолет, хорошо?
            
        state: Accepted
            q: (да/давай/хорошо)
            a: Отлично!
            
        state: Rejected
            q: (нет/не надо)
            a: Боюсь, что ничего другого я пока предложить не могу.

    state: NoMatch
        event!: noMatch
        a: Простите, я не понял. Переформулируйте, пожалуйста, ваш запрос.