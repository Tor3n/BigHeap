package miniProjects.HashmapAnalisys;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

public class HashClient extends JFrame implements ActionListener, TreeSelectionListener  {

    JFrame jfMain;
    JSplitPane jpContainer;
    JScrollPane jpTreeView;
    JPanel jpDescr;
    JTree tree;
    DefaultMutableTreeNode top;
    JEditorPane text;

    public HashClient(){
        jfMain = new JFrame("frame");
        jfMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfMain.setLayout(new BorderLayout());

        initNodes();
        initPanes();

        jpContainer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jpTreeView,jpDescr);
        jfMain.add(jpContainer);
        jpContainer.setDividerLocation(300);

        jfMain.setSize(800,tree.getRowCount()>10&&tree.getRowCount()<30?400:tree.getRowCount()>50?600:500);
        jfMain.setVisible(true);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        HashMap inputs = InputStarter.initData();
        HashClient client = new HashClient();
        HashLogic.printMapParams(inputs, client.getTree(), client.getTop());

        for (int i = 0; i < client.getTree().getRowCount(); i++) {
            client.getTree().expandRow(i);
        }
    }

    private void initNodes() {
        top = new DefaultMutableTreeNode("thisHashmap");
        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.addTreeSelectionListener(this);
    }

    private void initPanes(){
        text = new JEditorPane();
        text.setEditable(false);
        text.setOpaque(false);
        text.setText("Press the buckets to see the contents. " +
                "Tree structure represents the relationships between the nodes." +
                " Best Maps are those that don't have linked or treefied nodes.");


        jpTreeView = new JScrollPane(tree);
        jpTreeView.setMinimumSize(new Dimension(300,300));
        jpDescr = new JPanel(new BorderLayout());
        //jpDescr.setLayout(new BorderLayout());
        //jpDescr.add(text);
        jpDescr.add(new JScrollPane(text), BorderLayout.CENTER);
        jpDescr.setMinimumSize(new Dimension(200,300));

        jpDescr.setBorder(BorderFactory.createCompoundBorder());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode choix = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (choix==null) return;
        Object choixNode = choix.getUserObject();

        if (choixNode.equals("thisHashmap")){
            text.setText("Press the buckets to see the contents. " +
                    "Tree structure represents the relationships between the nodes." +
                    " Best Maps are those that don't have linked or treefied nodes.");
        } else {
            if (choixNode instanceof ArrayList){
                text.setText(((ArrayList<String>) choixNode).get(0));
            } else {
                text.setText("this node is empty");
            }

        }

    }

    public JTree getTree(){
        return tree;
    }

    public DefaultMutableTreeNode getTop(){
        return top;
    }
}
