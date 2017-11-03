# hi-solr

## How to

Run Solr with docker
```bash
docker run --rm -d -p 8983:8983 -t solr:7
```

## Solr

This REST endpoints can be used to query Solr data or plug them in client application code
```bash
curl -X POST \
     -d "action=CREATE&name=helloWorld&instanceDir=helloWorld" \
     -H "Content-Type: application/json" \
     http://localhost:8983/solr/admin/cores
```

## References
- http://www.baeldung.com/spring-data-solr
- https://examples.javacodegeeks.com/enterprise-java/apache-solr/apache-solr-hello-world-example
- https://gist.github.com/subfuzion/08c5d85437d5d4f00e58
