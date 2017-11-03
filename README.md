# hi-solr

## How to

### Run all :smiley:

```bash
docker-compose -up
```

### Solr

- Create a `product` collection executing a `solr command` (a new config called `myconfig` will be created)

```bash
docker exec -it --user=solr solr1 solr create -c product -n myconfig
```

- Create a `product` collection calling a `REST Api`

First, create a config

```bash
curl -X POST \
     -H "Content-Type: application/json" \
     'http://localhost:8983/solr/admin/configs?action=CREATE&name=myconfig&baseConfigSet=_default'
```

And then, create a collection

```bash
curl -X POST \
     -H "Content-Type: application/json" \
     'http://localhost:8983/solr/admin/collections?action=CREATE&name=product&numShards=2&replicationFactor=2&maxShardsPerNode=2&collection.configName=myconfig'
```

#### Manipulate products directly from Solr

```bash
curl http://localhost:8983/solr/product/update -d "[ {\"id\" : \"1\",  \"name\" : \"Smartphone\" }]"
```

Show directly from Solr

```bash
curl 'http://localhost:8983/solr/product/get?id=1'
```

### Spring Boot Application with Spring Data Solr

Create product in application

```bash
curl -X POST \
     -H "Content-Type: application/json" \
     -d '{"id":"2", "name":"iMac"}' \
     http://localhost:8080/products
```

## References
- https://lucene.apache.org/solr/guide/7_1/solr-tutorial.html
- https://dzone.com/articles/spring-data-solr-cloud-zookeeper-mongodb-ubuntu-in
- http://www.baeldung.com/spring-data-solr
- https://examples.javacodegeeks.com/enterprise-java/apache-solr/apache-solr-hello-world-example
- https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
