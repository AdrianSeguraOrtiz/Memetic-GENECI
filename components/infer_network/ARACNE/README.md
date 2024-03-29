## NAME

ARACNE

## AUTHOR

Adrián Segura Ortiz

## DESCRIPTION

Given a CSV file with differential expression data, this component infers its gene regulatory network by applying the ARACNE technique.

# DOCKER

## Build

```
docker build -t adriansegura99/geneci_infer-network_aracne:1.0.0 -f components/infer_network/ARACNE/Dockerfile .
```

## Run

```
docker run -v $(pwd)/inferred_networks:/usr/local/src/inferred_networks/ adriansegura99/geneci_infer-network_aracne expression_data.csv inferred_networks
```
