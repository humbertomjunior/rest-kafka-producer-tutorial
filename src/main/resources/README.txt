- Comando para listar todos os listeners ativos. Substituir "NEW-USER" pelo groupId que está como listener.
kafka-consumer-groups.sh --describe --group NEW-USER --members --bootstrap-server localhost:9092

- Comando para listar as mensagens que estão na fila. Substituir "TEST" pelo nome do tópico.
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic TEST --from-beginning