# apachekafka
# Apache kafka /config/server.properties konfigürasyonları

# 1)	Broker.id ile broker numarasını veriyoruz
 
# Her broker ın ayrı bir numarası olması gerekiyor
# 2)listeners=PLAINTEXT://:9092 eğer 9092 den ayrı bir port ta çalıştırmak istersek buradan değiştirip comment karakterini kaldırıyoruz
 


 
# 3) log.dirs kullanarak kafkanın verileri nereye saklaması gerektiğini belirtiyoruz
 
# 4) num partitions ile standart olarak bir topic oluşturulduğunda kaç partitions olması gerektiğini belirtiyoruz.
 
# 5) log.retantion.hours ile bilgilerin max olarak kaç gün saklanacağını belirtiyoruz
 
# 6) log.retention.bytes ile toplam veri büyüklüğünü kontrol ediyoruz.
