module ch.bbw.pr.helloworldfx {
	requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
	requires transitive javafx.fxml;

    opens ch.bbw.pr.sort to javafx.fxml;
    exports ch.bbw.pr.sort;
}