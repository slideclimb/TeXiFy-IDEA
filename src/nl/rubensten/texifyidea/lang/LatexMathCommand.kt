package nl.rubensten.texifyidea.lang

import nl.rubensten.texifyidea.lang.Argument.Type
import nl.rubensten.texifyidea.lang.Package.Companion.AMSFONTS
import nl.rubensten.texifyidea.lang.Package.Companion.AMSMATH
import nl.rubensten.texifyidea.lang.Package.Companion.AMSSYMB
import nl.rubensten.texifyidea.lang.Package.Companion.DEFAULT
import nl.rubensten.texifyidea.lang.Package.Companion.LATEXSYMB

/**
 * @author Sten Wessel
 */
enum class LatexMathCommand(
        override val command: String,
        override vararg val arguments: Argument = emptyArray(),
        override val dependency: Package = DEFAULT,
        override val display: String? = null,
        val collapse: Boolean = false
) : LatexCommand {

    /*
     *  Greek alphabet
     */
    ALPHA("alpha", display = "α", collapse = true),
    BETA("beta", display = "β", collapse = true),
    GAMMA("gamma", display = "γ", collapse = true),
    CAPITAL_GAMMA("Gamma", display = "Γ", collapse = true),
    DELTA("delta", display = "δ", collapse = true),
    CAPITAL_DELTA("Delta", display = "Δ", collapse = true),
    EPSILON("epsilon", display = "ϵ", collapse = true),
    EPSILON_SYMBOL("varepsilon", display = "ε", collapse = true),
    ZETA("zeta", display = "ζ", collapse = true),
    ETA("eta", display = "η", collapse = true),
    THETA("theta", display = "θ", collapse = true),
    THETA_SYMBOL("vartheta", display = "ϑ", collapse = true),
    CAPITAL_THETA("Theta", display = "Θ", collapse = true),
    IOTA("iota", display = "ι", collapse = true),
    KAPPA("kappa", display = "κ", collapse = true),
    LAMBDA("lambda", display = "λ", collapse = true),
    CAPITAL_LAMBDA("Lambda", display = "Λ", collapse = true),
    MU("mu", display = "μ", collapse = true),
    NU("nu", display = "ν", collapse = true),
    XI("xi", display = "ξ", collapse = true),
    CAPITAL_XI("Xi", display = "Ξ", collapse = true),
    PI("pi", display = "π", collapse = true),
    PI_SYMBOL("varpi", display = "ϖ", collapse = true),
    CAPITAL_PI("Pi", display = "Π", collapse = true),
    RHO("rho", display = "ρ", collapse = true),
    RHO_SYMBOL("varrho", display = "ϱ", collapse = true),
    SIGMA("sigma", display = "σ", collapse = true),
    FINAL_SIGMA("varsigma", display = "ς", collapse = true),
    CAPTIAL_SIGMA("Sigma", display = "Σ", collapse = true),
    TAU("tau", display = "τ", collapse = true),
    UPSILON("upsilon", display = "υ", collapse = true),
    PHI("phi", display = "φ", collapse = true),
    PHI_SYMBOL("varphi", display = "ϕ", collapse = true),
    CAPITAL_PHI("Phi", display = "Φ", collapse = true),
    CHI("chi", display = "χ", collapse = true),
    PSI("psi", display = "ψ", collapse = true),
    CAPITAL_PSI("Psi", display = "Ψ", collapse = true),
    OMEGA("omega", display = "ω", collapse = true),
    CAPITAL_OMEGA("Omega", display = "Ω", collapse = true),

    /*
     *  Operators
     */
    FORALL("forall", display = "∀", collapse = true),
    PARTIAL("partial", display = "∂", collapse = true),
    EXISTS("exists", display = "∃", collapse = true),
    NEXISTS("nexists", dependency = AMSSYMB, display = "∄", collapse = true),
    EMPTY_SET("emptyset", display = "∅", collapse = true),
    NOTHING("varnothing", dependency = AMSSYMB, display = "∅", collapse = true),
    NABLA("nabla", display = "∇", collapse = true),
    ELEMENT_OF("in", display = "∈", collapse = true),
    NOT_ELEMENT_OF("notin", display = "∉", collapse = true),
    CONTAIN_AS_MEMBER("ni", display = "∋", collapse = true),
    COMPLEMENT("complement", dependency = AMSSYMB, display = "∁"),
    BIG_PRODUCT("prod", display = "∏", collapse = true),
    COPRODUCT("coprod", display = "∐", collapse = true),
    SUM("sum", display = "∑", collapse = true),
    MINUS_PLUS("mp", display = "∓", collapse = true),
    SET_MINUS("setminus", display = "∖", collapse = true),
    SMALL_SET_MINUS("smallsetminus", dependency = AMSSYMB, display = "∖", collapse = true),
    ASTERISK("ast", display = "∗"),
    DOT_PLUS("dotplus", dependency = AMSSYMB, display = "∔"),
    CIRCLE("circ", display = "∘"),
    BULLET("bullet", display = "∙"),
    PROPORTIONAL_TO("propto", display = "∝", collapse = true),
    PROPORTIONAL_TO_SYMBOL("varpropto", dependency = AMSSYMB, display = "∝", collapse = true),
    INFINITY("infty", display = "∞", collapse = true),
    ANGLE("angle", display = "∠", collapse = true),
    MEASURED_ANGLE("measuredangle", dependency = AMSSYMB, display = "∡", collapse = true),
    SPHERICAL_ANGLE("sphericalangle", dependency = AMSSYMB, display = "∢", collapse = true),
    MID("mid", display = "∣", collapse = true),
    MID_SHORT("shortmid", dependency = AMSSYMB, display = "∣", collapse = true),
    PARALLEL("parallel", display = "∥", collapse = true),
    NOT_PARALLEL("nparallel", dependency = AMSSYMB, display = "∦", collapse = true),
    LOGICAL_AND("land", display = "∧", collapse = true),
    LOGICAL_OR("lor", display = "∨", collapse = true),
    INTERSECTION("cap", display = "∩", collapse = true),
    UNION("cup", display = "∪", collapse = true),
    INTEGRAL("int", display = "∫", collapse = true),
    DOUBLE_INTEGRAL("iint", dependency = AMSMATH, display = "∬", collapse = true),
    TRIPLE_INTEGRAL("iiint", dependency = AMSMATH, display = "∭", collapse = true),
    QUADRUPLE_INTEGRAL("iiiint", dependency = AMSMATH, display = "⨌", collapse = true),
    CONTOUR_INTEGRAL("oint", display = "∮", collapse = true),
    THEREFORE("therefore", dependency = AMSSYMB, display = "∴", collapse = true),
    BECAUSE("because", dependency = AMSSYMB, display = "∵", collapse = true),
    TILDE_OPERATOR("sim", display = "~", collapse = true),
    WREATH_PRODUCT("wr", display = "≀", collapse = true),
    APPROX("approx", display = "≈", collapse = true),
    NOT_EQUAL("neq", display = "≠", collapse = true),
    EQUIVALENT("equiv", display = "≡", collapse = true),
    LESS_THAN_EQUAL("leq", display = "≤", collapse = true),
    LESS_THAN_EQUALL("leqq", dependency = AMSSYMB, display = "≦", collapse = true),
    GREATER_THAN_EQUAL("geq", display = "≥", collapse = true),
    GREATER_THAN_EQUALL("geqq", dependency = AMSSYMB, display = "≧", collapse = true),
    NOT_LESS_THAN("nless", dependency = AMSSYMB, display = "≮", collapse = true),
    NOT_GREATER_THAN("ngtr", dependency = AMSSYMB, display = "≯", collapse = true),
    NOT_LESS_THAN_EQUAL("nleq", dependency = AMSSYMB, display = "≰", collapse = true),
    NOT_LESS_THAN_EQUALL("nleqq", dependency = AMSSYMB, display = "≦\u200D\u0338"),
    NOT_GREATER_THAN_EQUAL("ngeq", dependency = AMSSYMB, display = "≱", collapse = true),
    NOT_GREATER_THAN_EQUALL("ngeqq", dependency = AMSSYMB, display = "≧\u200D\u0338"),
    LESSER_LESSER("ll", dependency = AMSSYMB, display = "≪", collapse = true),
    LESSER_LESSER_LESSER("lll", dependency = AMSSYMB, display = "⋘", collapse = true),
    LESSER_NOT_EQUAL("lneqq", dependency = AMSSYMB, display = "≨", collapse = true),
    GREATER_NOT_EQUAL("gneqq", dependency = AMSSYMB, display = "≩", collapse = true),
    GREATER_GREATER("gg", dependency = AMSSYMB, display = "≫", collapse = true),
    GREATER_GREATER_GREATER("ggg", dependency = AMSSYMB, display = "⋙", collapse = true),
    SUBSET("subset", display = "⊂", collapse = true),
    SUPSET("supset", display = "⊃", collapse = true),
    SUBSET_EQ("subseteq", display = "⊆", collapse = true),
    SUBSET_EQQ("subseteqq", dependency = AMSSYMB, display = "⊆", collapse = true),
    SUPSET_EQ("supseteq", display = "⊇", collapse = true),
    SUPSET_EQQ("supseteqq", dependency = AMSSYMB, display = "⊇", collapse = true),
    NOT_SUBSET_EQ("nsubseteq", dependency = AMSSYMB, display = "⊈", collapse = true),
    NOT_SUBSET_EQQ("nsubseteqq", dependency = AMSSYMB, display = "⊈", collapse = true),
    NOT_SUPSET_EQ("nsupseteq", dependency = AMSSYMB, display = "⊉", collapse = true),
    NOT_SUPSET_EQQ("nsupseteqq", dependency = AMSSYMB, display = "⊉", collapse = true),
    SQUARE_SUBSET("sqsubset", dependency = AMSSYMB, display = "⊏", collapse = true),
    SQUARE_SUPSET("sqsupset", dependency = AMSSYMB, display = "⊐", collapse = true),
    SQUARE_SUBSET_EQ("sqsubseteq", dependency = AMSSYMB, display = "⊑", collapse = true),
    SQUARE_SUPSET_EQ("sqsupseteq", dependency = AMSSYMB, display = "⊒", collapse = true),
    SQUARE_CAP("sqcap", display = "⊓", collapse = true),
    SQUARE_CUP("sqcup", display = "⊔", collapse = true),
    CIRCLED_PLUS("oplus", display = "⊕", collapse = true),
    CIRCLED_MINUS("ominus", display = "⊖", collapse = true),
    CIRCLED_TIMES("otimes", display = "⊗", collapse = true),
    CIRCLED_SLASH("oslash", display = "⊘", collapse = true),
    CIRCLED_DOT("odot", display = "⊙", collapse = true),
    BOXED_PLUS("boxplus", dependency = AMSSYMB, display = "⊞", collapse = true),
    BOXED_MINUS("boxminus", dependency = AMSSYMB, display = "⊟", collapse = true),
    BOXED_TIMES("boxtimes", dependency = AMSSYMB, display = "⊠", collapse = true),
    BOXED_DOT("boxdot", dependency = AMSSYMB, display = "⊡", collapse = true),
    BOWTIE("bowtie", display = "⋈", collapse = true),
    JOIN("Join", dependency = AMSSYMB, display = "⨝", collapse = true),
    TRIANGLERIGHT("triangleright", dependency = AMSSYMB, display = "▷", collapse = true),
    TRIANGLELEFT("triangleleft", dependency = AMSSYMB, display = "◁", collapse = true),
    VARTRIANGLERIGHT("vartriangleright", dependency = AMSSYMB, display = "⊳", collapse = true),
    VARTRIANGLELEFT("vartriangleleft", dependency = AMSSYMB, display = "⊲", collapse = true),
    TRIANGLELEFTEQ("tranglelefteq", dependency = AMSSYMB, display = "⊴", collapse = true),
    TRIANGLERIGHTEQ("trianglerighteq", dependency = AMSSYMB, display = "⊵", collapse = true),
    LTIMES("ltimes", dependency = AMSSYMB, display = "⋉", collapse = true),
    RTIMES("rtimes", dependency = AMSSYMB, display = "⋊", collapse = true),
    TIMES("times", display = "×", collapse = true),

    /*
     *  Left/Right
     */
    LEFT_PARENTH("left(", display = "("),
    RIGHT_PARENTH("right)", display = ")"),
    LEFT_BRACKET("left[", display = "["),
    RIGHT_BRACKET("right]", display = "]"),
    LEFT_BRACE("left\\{", display = "{"),
    RIGHT_BRACE("right\\}", display = "}"),
    LEFT_ANGULAR("left<", display = "<"),
    RIGHT_ANGULAR("right>", display = ">"),
    LEFT_PIPE("left|", display = "|"),
    RIGHT_PIPE("right|", display = "|"),
    LEFT_DOUBLE_PIPE("left\\|", display = "||"),
    RIGHT_DOUBLE_PIPE("right\\|", display = "||"),
    LANGLE("langle", display = "<"),
    RANGLE("rangle", display = ">"),

    /*
     *  Arrows
     */
    NRIGHTARROW("nrightarrow", dependency = AMSSYMB, display = "↛", collapse = true),
    LEFTARROW("leftarrow", display = "←", collapse = true),
    L_EFTARROW("Leftarrow", display = "⇐", collapse = true),
    RIGHTARROW("rightarrow", display = "→", collapse = true),
    R_IGHTARROW("Rightarrow", display = "⇒", collapse = true),
    LEFTRIGHTARROW("leftrightarrow", display = "↔", collapse = true),
    L_EFTRIGHTARROW("Leftrightarrow", display = "⇔", collapse = true),
    LONGLEFTARROW("longleftarrow", display = "⟵", collapse = true),
    L_ONGLEFTARROW("Longleftarrow", display = "⟸", collapse = true),
    LONGRIGHTARROW("longrightarrow", display = "⟶", collapse = true),
    L_ONGRIGHTARROW("Longrightarrow", display = "⟹", collapse = true),
    LONGLEFTRIGHTARROW("longleftrightarrow", display = "⟷", collapse = true),
    L_ONGLEFTRIGHTARROW("Longleftrightarrow", display = "⟺", collapse = true),
    UPARROW("uparrow", display = "↑", collapse = true),
    U_PARROW("Uparrow", display = "⇑", collapse = true),
    DOWNARROW("downarrow", display = "↓", collapse = true),
    D_OWNARROW("Downarrow", display = "⇓", collapse = true),
    UPDOWNARROW("updownarrow", display = "↕", collapse = true),
    U_PDOWNARROW("Updownarrow", display = "⇕", collapse = true),
    MAPSTO("mapsto", display = "↦", collapse = true),
    HOOKLEFTARROW("hookleftarrow", display = "↩", collapse = true),
    LEFTHARPOONUP("leftharpoonup", display = "↼", collapse = true),
    LEFTHARPOONDOWN("leftharpoondown", display = "↽", collapse = true),
    RIGHTLEFTHARPOONS("rightleftharpoons", display = "⇌", collapse = true),
    LONGMAPSTO("longmapsto", display = "⟼", collapse = true),
    HOOKRIGHTARROW("hookrightarrow", display = "↪", collapse = true),
    RIGHTHARPOONUP("rightharpoonup", display = "⇀", collapse = true),
    RIGHTHARPOONDOWN("rightharpoondown", display = "⇁", collapse = true),
    LEADSTO("leadsto", dependency = LATEXSYMB, display = "⤳", collapse = true),
    NEARROW("nearrow", display = "↗", collapse = true),
    SEARROW("searrow", display = "↘", collapse = true),
    SWARROW("swarrow", display = "↙", collapse = true),
    NWARROW("nwarrow", display = "↖", collapse = true),
    DASHRIGHTARROW("dashrightarrow", dependency = AMSSYMB, display = "⤍", collapse = true),
    LEFTRIGHTARROWS("leftrightarrows", dependency = AMSSYMB, display = "⇆", collapse = true),
    LEFTARROWTAIL("leftarrowtail", dependency = AMSSYMB, display = "↢", collapse = true),
    CURVEARROWLEFT("curvearrowleft", dependency = AMSSYMB, display = "↶", collapse = true),
    UPUPARROWS("upuparrows", dependency = AMSSYMB, display = "⇈", collapse = true),
    MULTIMAP("multimap", dependency = AMSSYMB, display = "⊸", collapse = true),
    RIGHTLEFTARROWS("rightleftarrows", dependency = AMSSYMB, display = "⇄", collapse = true),
    TWOHEADRIGHTARROW("twoheadrightarrow", dependency = AMSSYMB, display = "↠", collapse = true),
    RSH("Rsh", dependency = AMSSYMB, display = "↱", collapse = true),
    DOWNHARPOONRIGHT("downharpoonright", dependency = AMSSYMB, display = "⇂", collapse = true),
    DASHLEFTARROW("dashleftarrow", dependency = AMSSYMB, display = "⇠", collapse = true),
    L_LEFTARROW("Lleftarrow", dependency = AMSSYMB, display = "⇚", collapse = true),
    LOOPARROWLEFT("looparrowleft", dependency = AMSSYMB, display = "↫", collapse = true),
    CIRCLEARROWLEFT("circlearrowleft", dependency = AMSSYMB, display = "↺", collapse = true),
    UPHARPOONLEFT("upharpoonleft", dependency = AMSSYMB, display = "↿", collapse = true),
    LEFTRIGHTSQUIGARROW("leftrightsquigarrow", dependency = AMSSYMB, display = "↭", collapse = true),
    RIGHTRIGHTARROWS("rightrightarrows", dependency = AMSSYMB, display = "⇉", collapse = true),
    RIGHTARROWTAIL("rightarrowtail", dependency = AMSSYMB, display = "↣", collapse = true),
    CURVEARROWRIGHT("curvearrowright", dependency = AMSSYMB, display = "↷", collapse = true),
    DOWNDOWNARROWS("downdownarrows", dependency = AMSSYMB, display = "⇊", collapse = true),
    RIGHTSQUIGARROW("rightsquigarrow", dependency = AMSSYMB, display = "⇝", collapse = true),
    LEFTLEFTARROWS("leftleftarrows", dependency = AMSSYMB, display = "⇇", collapse = true),
    TWOHEADLEFTARROW("twoheadleftarrow", dependency = AMSSYMB, display = "↞", collapse = true),
    LEFTRIGHTHARPOONS("leftrightharpoons", dependency = AMSSYMB, display = "↰", collapse = true),
    LSH("Lsh", dependency = AMSSYMB, display = "↿", collapse = true),
    DOWNHARPOONLEFT("downharpoonleft", dependency = AMSSYMB, display = "⇃", collapse = true),
    LOOPARROWRIGHT("looparrowright", dependency = AMSSYMB, display = "↬", collapse = true),
    CIRCLEARROWRIGHT("circlearrowright", dependency = AMSSYMB, display = "↻", collapse = true),
    UPHARPOONRIGHT("rightsquigarrow", dependency = AMSSYMB, display = "↾", collapse = true),
    NLEFTARROW("nleftarrow", dependency = AMSSYMB, display = "↚", collapse = true),
    NL_EFTARROW("nLeftarrow", dependency = AMSSYMB, display = "⇍", collapse = true),
    NR_IGHTARROW("nRightarrow", dependency = AMSSYMB, display = "⇏", collapse = true),
    NLEFTRIGHTARROW("nleftrightarrow", dependency = AMSSYMB, display = "↮", collapse = true),
    NL_EFTRIGHTARROW("nLeftrightarrow", dependency = AMSSYMB, display = "⇎", collapse = true),

    /*
     *  Generic commands
     */
    MATHBB("mathbb", "text".asRequired(Type.TEXT), dependency = AMSFONTS),
    MATHBF("mathbf", "text".asRequired()),
    MATHCAL("mathcal", "text".asRequired()),
    MATHDS("mathds", "mathds".asRequired()),
    MATHELLIPSIS("mathellipsis"),
    MATHFRAK("mathfrak", "text".asRequired(Type.TEXT), dependency = AMSFONTS),
    MATHGROUP("mathgroup"),
    MATHIT("mathit", "text".asRequired()),
    MATHNORMAL("mathnormal", "text".asRequired()),
    MATHRM("mathrm", "text".asRequired()),
    MATHSCR("mathscr"),
    MATHSF("mathsf", "text".asRequired()),
    MATHSTERLING("mathsterling"),
    MATHTT("mathtt", "text".asRequired()),
    MATHUNDERSCORE("mathunderscore"),
    SQRT("sqrt", "root".asOptional(), "arg".asRequired()),
    ACUTE("acute", "a".asRequired()),
    ALEPH("aleph"),
    AMALG("amalg"),
    ARCCOS("arccos"),
    ARCSIN("arcsin"),
    ARCTAN("arctan"),
    ARG("arg"),
    ARROWVERT("arrowvert", display = "|", collapse = true),
    CAPITAL_ARROWVERT("Arrowvert"),
    ASYMP("asymp", display = "≍", collapse = true),
    BACKSLASH("backslash", display = "\\", collapse = true),
    BAR("bar", "a".asRequired()),
    BIGCAP("bigcap", display = "⋂", collapse = true),
    BIGCIRC("bigcirc", display = "○", collapse = true),
    BIGCUP("bigcup", display = "⋃", collapse = true),
    BIGODOT("bigodot", display = "⨀", collapse = true),
    BIGOPLUS("bigoplus", display = "⨁", collapse = true),
    BIGOTIMES("bigotimes", display = "⨂", collapse = true),
    BIGSQCUP("bigsqcup", display = "⨆", collapse = true),
    BIGTRIANGLEDOWN("bigtriangledown", display = "▽", collapse = true),
    BIGTRIANGLEUP("bigtriangleup", display = "∆", collapse = true),
    BIGUPLUS("biguplus", display = "⨄", collapse = true),
    BIGVEE("bigvee", display = "⋁", collapse = true),
    BIGWEDGE("bigwedge", display = "⋀", collapse = true),
    BINOM("binom", "total".asRequired(), "sample".asRequired()),
    BOT("bot", display = "⟂", collapse = true),
    BRACEVERT("bracevert"),
    BREVE("breve", "a".asRequired()),
    CDOT("cdot", display = "·", collapse = true),
    CDOTS("cdots", display = "⋯", collapse = true),
    CHECK("check", "a".asRequired()),
    CLUBSUIT("clubsuit", display = "♣", collapse = true),
    COLON("colon", display = ":", collapse = true),
    CONG("cong"),
    COS("cos"),
    COSH("cosh"),
    COT("cot"),
    COTH("coth"),
    CSC("csc"),
    DAGGER("dagger", display = "†", collapse = true),
    DASHV("dashv", display = "⊣", collapse = true),
    DDAGGER("ddagger", display = "‡", collapse = true),
    DEG("deg"),
    DET("det"),
    DFRAC("dfrac", "num".asRequired(), "den".asRequired(), dependency = AMSMATH),
    DIAMOND("diamond", display = "◇", collapse = true),
    DIAMONDSUIT("diamondsuit", display = "♢", collapse = true),
    DIM("dim"),
    DIV("div", display = "÷", collapse = true),
    DIVIDEONTIMES("divideontimes", dependency = AMSSYMB, display = "⋇", collapse = true),
    DOTEQ("doteq"),
    DOT("dot", "a".asRequired()),
    DOTS("dots", display = "⋯", collapse = true),
    ELL("ell"),
    EXP("exp"),
    FLAT("flat", display = "♭", collapse = true),
    SHARP("sharp", display = "♯", collapse = true),
    FRAC("frac", "num".asRequired(), "den".asRequired()),
    GRAVE("grave", "a".asRequired()),
    HAT("hat", "a".asRequired()),
    MATHRING("mathring", "a".asRequired()),
    OVERBRACE("overbrace", "text".asRequired()),
    OVERLINE("overline", "text".asRequired()),
    TEXT("text", "text".asRequired(), dependency = AMSMATH),
    TILDE("tilde", "a".asRequired()),
    UNDERBRACE("underbrace", "text".asRequired()),
    UNDERLINE("underline", "text".asRequired()),
    VEC("vec", "a".asRequired()),
    VEE("vee",  display = "⋁", collapse = true),
    WEDGE("wedge", display = "⋀", collapse = true),
    WIDEHAT("widehat", "text".asRequired()),
    WIDETILDE("widetilde", "text".asRequired());

    companion object {

        private val lookup = HashMap<String, LatexMathCommand>()
        private val lookupDisplay = HashMap<String, LatexMathCommand>()

        init {
            for (command in LatexMathCommand.values()) {
                lookup[command.command] = command
                if (command.display != null) {
                    lookupDisplay.putIfAbsent(command.display!!, command)
                }
            }
        }

        @JvmStatic
        operator fun get(command: String) = lookup[command]

        @JvmStatic
        fun findByDisplay(display: String) = lookupDisplay[display]
    }
}