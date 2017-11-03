# hi-solr

## How to

### Run all :smiley:

```bash
docker-compose -up
```

### Run just Solr with docker

```bash
docker run --rm -d -p 8983:8983 -t solr:7.1
```

## Solr

Create collections
```bash
curl -X POST \
     -H "Content-Type: application/json" \
     'http://localhost:2181/solr/admin/collections?action=CREATE&name=product&numShards=2&replicationFactor=2&maxShardsPerNode=2&collection.configName=product'
```

Create product in application
```bash
curl -X POST \
     -H "Content-Type: application/json" \
     -d '{"id":"1", "name":"iMac"}' \
     http://localhost:8080/products
```

## References
- https://lucene.apache.org/solr/guide/7_1/solr-tutorial.html
- https://dzone.com/articles/spring-data-solr-cloud-zookeeper-mongodb-ubuntu-in
- http://www.baeldung.com/spring-data-solr
- https://examples.javacodegeeks.com/enterprise-java/apache-solr/apache-solr-hello-world-example
- https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
