# EAGRN-Inference
Evolutionary algorithm for determining the optimal ensemble of unsupervised learning techniques for gene network inference.

# Techniques contemplated 
- GENIE3:
    - Python: https://arboreto.readthedocs.io/en/latest/ (GENIE3.py) --> Te permite RF, ET y GBM (Tiene una opción adicional)
    - R: https://bioconductor.org/packages/release/bioc/html/GENIE3.html (GENIE3.R) --> Te permite RF, ET (Va mucho más rapido)

- CLR: 
    - R: https://www.bioconductor.org/packages/release/bioc/html/minet.html (CLR.R)

- ARACNE: 
    - Python SH: https://github.com/jyyulab/SJARACNe (No sé instalarlo pero está muy bien)
    - R: https://www.bioconductor.org/packages/release/bioc/html/minet.html (ARACNE.R)

- MRNET:
    - R: https://www.bioconductor.org/packages/release/bioc/html/minet.html (MRNET.R)

- MRNETB:
    - R: https://www.bioconductor.org/packages/release/bioc/html/minet.html (MRNETB.R)

- C3NET
    - R: https://cran.rstudio.com/web/packages/c3net/index.html (C3NET.R)

- BC3NET 
    - R: https://cran.rstudio.com/web/packages/bc3net/index.html (BC3NET.R)

- PCIT
    - R: http://www.bioconductor.org/packages/release/bioc/html/CeTF.html (PCIT.R)

# Annotations

Respecto a GENIE3, CLR, ARACNE, MRNET y MRNETB:
    - GENIE3 se implementa en el paquete GENIE3
    - CLR, ARACNE, MRNET y MRNETB se implementan en minet
    - BioNERO es un paquete reciente de R/Bioconductor pero llama a los dos anteriores para usar GENIE3, CLR y ARACNE. Aunque sea más actual, simplemente llama a librerías antiguas simplificando los parámetros de entrada (lo cual no nos interesa). Además de que no implementa ni MRNET ni MRNETB, por eso se han escogido los paquetes antiguos.

Respecto a C3NET y BC3NET:
    - Tienen muchos parámetros que no entiendo, preguntar cuáles combinaciones se podrían probar