package uk.co.dantwining;

import org.apache.maven.doxia.logging.Log;
import org.apache.maven.doxia.sink.Sink;
import org.apache.maven.doxia.sink.SinkEventAttributes;

/**
 * Created with IntelliJ IDEA.
 * User: dantwining
 * Date: 19/04/2013
 * Time: 06:14
 * To change this template use File | Settings | File Templates.
 */
public class SinkWrapper implements Sink {

    private Sink delegate;

    public SinkWrapper(Sink sink) {
        delegate = sink;
    }

    public void head() {
        delegate.head();
    }

    public void author(SinkEventAttributes sinkEventAttributes) {
        delegate.author(sinkEventAttributes);
    }

    public void tableCell() {
        delegate.tableCell();
    }

    public void tableCaption_() {
        delegate.tableCaption_();
    }

    public void definitionList(SinkEventAttributes sinkEventAttributes) {
        delegate.definitionList(sinkEventAttributes);
    }

    public void table_() {
        delegate.table_();
    }

    public void figure() {
        delegate.figure();
    }

    public void figure_() {
        delegate.figure_();
    }

    public void list_() {
        delegate.list_();
    }

    public void title() {
        delegate.title();
    }

    public void definitionListItem_() {
        delegate.definitionListItem_();
    }

    public void figureGraphics(String s) {
        delegate.figureGraphics(s);
    }

    public void horizontalRule() {
        delegate.horizontalRule();
    }

    public void pageBreak() {
        delegate.pageBreak();
    }

    public void definedTerm(SinkEventAttributes sinkEventAttributes) {
        delegate.definedTerm(sinkEventAttributes);
    }

    public void numberedList(int i) {
        delegate.numberedList(i);
    }

    public void enableLogging(Log log) {
        delegate.enableLogging(log);
    }

    public void title(SinkEventAttributes sinkEventAttributes) {
        delegate.title(sinkEventAttributes);
    }

    public void head_() {
        delegate.head_();
    }

    public void sectionTitle2_() {
        delegate.sectionTitle2_();
    }

    public void definition() {
        delegate.definition();
    }

    public void numberedListItem() {
        delegate.numberedListItem();
    }

    public void body(SinkEventAttributes sinkEventAttributes) {
        delegate.body(sinkEventAttributes);
    }

    public void definitionList() {
        delegate.definitionList();
    }

    public void section4_() {
        delegate.section4_();
    }

    public void sectionTitle4() {
        delegate.sectionTitle4();
    }

    public void monospaced_() {
        delegate.monospaced_();
    }

    public void tableHeaderCell(SinkEventAttributes sinkEventAttributes) {
        delegate.tableHeaderCell(sinkEventAttributes);
    }

    public void tableHeaderCell_() {
        delegate.tableHeaderCell_();
    }

    public void sectionTitle5_() {
        delegate.sectionTitle5_();
    }

    public void sectionTitle1_() {
        delegate.sectionTitle1_();
    }

    public void definitionList_() {
        delegate.definitionList_();
    }

    public void tableRow() {
        delegate.tableRow();
    }

    public void anchor(String s) {
        delegate.anchor(s);
    }

    public void numberedList(int i, SinkEventAttributes sinkEventAttributes) {
        delegate.numberedList(i, sinkEventAttributes);
    }

    public void monospaced() {
        delegate.monospaced();
    }

    public void figureCaption_() {
        delegate.figureCaption_();
    }

    public void definitionListItem() {
        delegate.definitionListItem();
    }

    public void definition(SinkEventAttributes sinkEventAttributes) {
        delegate.definition(sinkEventAttributes);
    }

    public void text(String s) {
        delegate.text(s);
    }

    public void table(SinkEventAttributes sinkEventAttributes) {
        delegate.table(sinkEventAttributes);
    }

    public void italic_() {
        delegate.italic_();
    }

    public void listItem(SinkEventAttributes sinkEventAttributes) {
        delegate.listItem(sinkEventAttributes);
    }

    public void tableHeaderCell() {
        delegate.tableHeaderCell();
    }

    public void section5() {
        delegate.section5();
    }

    public void title_() {
        delegate.title_();
    }

    public void sectionTitle(int i, SinkEventAttributes sinkEventAttributes) {
        delegate.sectionTitle(i, sinkEventAttributes);
    }

    public void anchor(String s, SinkEventAttributes sinkEventAttributes) {
        delegate.anchor(s, sinkEventAttributes);
    }

    public void author() {
        delegate.author();
    }

    public void figureCaption() {
        delegate.figureCaption();
    }

    public void body() {
        delegate.body();
    }

    public void tableCaption() {
        delegate.tableCaption();
    }

    public void paragraph() {
        delegate.paragraph();
    }

    public void definition_() {
        delegate.definition_();
    }

    public void figure(SinkEventAttributes sinkEventAttributes) {
        delegate.figure(sinkEventAttributes);
    }

    public void close() {
        delegate.close();
    }

    public void sectionTitle2() {
        delegate.sectionTitle2();
    }

    public void bold() {
        delegate.bold();
    }

    public void body_() {
        delegate.body_();
    }

    public void author_() {
        delegate.author_();
    }

    public void section2() {
        delegate.section2();
    }

    public void section2_() {
        delegate.section2_();
    }

    public void section1_() {
        delegate.section1_();
    }

    public void verbatim_() {
        delegate.verbatim_();
    }

    public void flush() {
        delegate.flush();
    }

    public void date_() {
        delegate.date_();
    }

    public void definedTerm() {
        delegate.definedTerm();
    }

    public void sectionTitle4_() {
        delegate.sectionTitle4_();
    }

    public void sectionTitle_(int i) {
        delegate.sectionTitle_(i);
    }

    public void listItem_() {
        delegate.listItem_();
    }

    public void section_(int i) {
        delegate.section_(i);
    }

    public void verbatim(SinkEventAttributes sinkEventAttributes) {
        delegate.verbatim(sinkEventAttributes);
    }

    public void listItem() {
        delegate.listItem();
    }

    public void head(SinkEventAttributes sinkEventAttributes) {
        delegate.head(sinkEventAttributes);
    }

    public void tableRows(int[] ints, boolean b) {
        delegate.tableRows(ints, b);
    }

    public void tableCaption(SinkEventAttributes sinkEventAttributes) {
        delegate.tableCaption(sinkEventAttributes);
    }

    public void section(int i, SinkEventAttributes sinkEventAttributes) {
        delegate.section(i, sinkEventAttributes);
    }

    public void definedTerm_() {
        delegate.definedTerm_();
    }

    public void date() {
        delegate.date();
    }

    public void sectionTitle_() {
        delegate.sectionTitle_();
    }

    public void figureGraphics(String s, SinkEventAttributes sinkEventAttributes) {
        delegate.figureGraphics(s, sinkEventAttributes);
    }

    public void nonBreakingSpace() {
        delegate.nonBreakingSpace();
    }

    public void sectionTitle3_() {
        delegate.sectionTitle3_();
    }

    public void numberedList_() {
        delegate.numberedList_();
    }

    public void figureCaption(SinkEventAttributes sinkEventAttributes) {
        delegate.figureCaption(sinkEventAttributes);
    }

    public void section5_() {
        delegate.section5_();
    }

    public void tableHeaderCell(String s) {
        delegate.tableHeaderCell(s);
    }

    public void paragraph(SinkEventAttributes sinkEventAttributes) {
        delegate.paragraph(sinkEventAttributes);
    }

    public void text(String s, SinkEventAttributes sinkEventAttributes) {
        delegate.text(s, sinkEventAttributes);
    }

    public void lineBreak(SinkEventAttributes sinkEventAttributes) {
        delegate.lineBreak(sinkEventAttributes);
    }

    public void tableCell_() {
        delegate.tableCell_();
    }

    public void italic() {
        delegate.italic();
    }

    public void sectionTitle5() {
        delegate.sectionTitle5();
    }

    public void unknown(String s, Object[] objects, SinkEventAttributes sinkEventAttributes) {
        delegate.unknown(s, objects, sinkEventAttributes);
    }

    public void sectionTitle1() {
        delegate.sectionTitle1();
    }

    public void bold_() {
        delegate.bold_();
    }

    public void list() {
        delegate.list();
    }

    public void tableCell(SinkEventAttributes sinkEventAttributes) {
        delegate.tableCell(sinkEventAttributes);
    }

    public void section3_() {
        delegate.section3_();
    }

    public void section4() {
        delegate.section4();
    }

    public void verbatim(boolean b) {
        delegate.verbatim(b);
    }

    public void rawText(String s) {
        delegate.rawText(s);
    }

    public void definitionListItem(SinkEventAttributes sinkEventAttributes) {
        delegate.definitionListItem(sinkEventAttributes);
    }

    public void link(String s) {
        delegate.link(s);
    }

    public void anchor_() {
        delegate.anchor_();
    }

    public void link_() {
        delegate.link_();
    }

    public void sectionTitle3() {
        delegate.sectionTitle3();
    }

    public void tableCell(String s) {
        delegate.tableCell(s);
    }

    public void comment(String s) {
        delegate.comment(s);
    }

    public void link(String s, SinkEventAttributes sinkEventAttributes) {
        delegate.link(s, sinkEventAttributes);
    }

    public void sectionTitle() {
        delegate.sectionTitle();
    }

    public void tableRows_() {
        delegate.tableRows_();
    }

    public void tableRow(SinkEventAttributes sinkEventAttributes) {
        delegate.tableRow(sinkEventAttributes);
    }

    public void section1() {
        delegate.section1();
    }

    public void paragraph_() {
        delegate.paragraph_();
    }

    public void list(SinkEventAttributes sinkEventAttributes) {
        delegate.list(sinkEventAttributes);
    }

    public void lineBreak() {
        delegate.lineBreak();
    }

    public void tableRow_() {
        delegate.tableRow_();
    }

    public void section3() {
        delegate.section3();
    }

    public void horizontalRule(SinkEventAttributes sinkEventAttributes) {
        delegate.horizontalRule(sinkEventAttributes);
    }

    public void table() {
        delegate.table();
    }

    public void numberedListItem_() {
        delegate.numberedListItem_();
    }

    public void numberedListItem(SinkEventAttributes sinkEventAttributes) {
        delegate.numberedListItem(sinkEventAttributes);
    }

    public void date(SinkEventAttributes sinkEventAttributes) {
        delegate.date(sinkEventAttributes);
    }
}
