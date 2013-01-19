package de.bwaldvogel.liblinear;

// origin: tron.h
interface Function {

    double fun(double[] w);

    void grad(double[] w, double[] g);

    void hv(double[] s, double[] Hs);

    int get_nr_variable();
}
