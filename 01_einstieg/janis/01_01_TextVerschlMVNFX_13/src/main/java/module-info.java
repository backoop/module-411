module ch.bbw.pr.textverschluesselung {
	requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
	requires transitive javafx.fxml;

    opens ch.bbw.pr.textverschluesselung to javafx.fxml;
    exports ch.bbw.pr.textverschluesselung;
}