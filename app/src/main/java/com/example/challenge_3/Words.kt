package com.example.challenge_3

val alphabets = ('A'..'Z').toList().map { it.toString() }

enum class Words( val char: String, val words: ArrayList<String>) {
    A("A", arrayListOf("Angsa", "Ayam", "Anjing")),
    B("B", arrayListOf("Beruang", "Bebek", "Bunglon")),
    C("C", arrayListOf("Cicak", "Cacing", "Capung")),
    D("D", arrayListOf("Domba", "Dinosaurus", "Dugong")),
    E("E", arrayListOf("Elang", "Entok", "Ekor Kuda")),
    F("F", arrayListOf("Flamingo", "Ferret", "Fajar")),
    G("G", arrayListOf("Gajah", "Gurita", "Gorila")),
    H("H", arrayListOf("Harimau", "Hamster", "Hiu")),
    I("I", arrayListOf("Iguana", "Ikan", "Ibis")),
    J("J", arrayListOf("Jerapah", "Jalak", "Jangkrik")),
    K("K", arrayListOf("Kucing", "Kuda Nil", "Kanguru")),
    L("L", arrayListOf("Lumba-lumba", "Landak", "Lebah")),
    M("M", arrayListOf("Monyet", "Merpati", "Marmut")),
    N("N", arrayListOf("Nyamuk", "Naga", "Nuri")),
    O("O", arrayListOf("Orangutan", "Ostrich", "Owa")),
    P("P", arrayListOf("Panda", "Penguin", "Puma")),
    Q("Q", arrayListOf("Quokka", "Quail", "Quoll")),
    R("R", arrayListOf("Rusa", "Rubah", "Rajawali")),
    S("S", arrayListOf("Singa", "Sapi", "Serigala")),
    T("T", arrayListOf("Tupai", "Terbang", "Tikus")),
    U("U", arrayListOf("Ular", "Ular Kobra", "Ubur-ubur")),
    V("V", arrayListOf("Vanga", "Vultur", "Vicuna")),
    W("W", arrayListOf("Walrus", "Wombat", "Wader")),
    X("X", arrayListOf("Xerus", "Xiphias", "Xenopus")),
    Y("Y", arrayListOf("Yak", "Yaki", "Yoyo")),
    Z("Z", arrayListOf("Zebra", "Zirafah", "Zonkey"))
}