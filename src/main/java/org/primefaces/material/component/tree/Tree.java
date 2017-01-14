package org.primefaces.material.component.tree;

import org.primefaces.component.api.PrimeClientBehaviorHolder;
import org.primefaces.component.api.RTLAware;
import org.primefaces.component.api.UITree;
import org.primefaces.component.api.Widget;
import org.primefaces.component.tree.UITreeNode;
import org.primefaces.event.*;
import org.primefaces.material.MaterialPrime;
import org.primefaces.model.TreeNode;
import org.primefaces.util.Constants;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.component.UINamingContainer;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.BehaviorEvent;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@ResourceDependencies({
        @ResourceDependency(library="primefaces", name="jquery/jquery.js"),
        @ResourceDependency(library="primefaces", name="jquery/jquery-plugins.js"),
        @ResourceDependency(library = "material-prime", name = "libs/materialize.js"),
        @ResourceDependency(library="primefaces", name="core.js"),
        @ResourceDependency(library="primefaces", name="components.js"),
        @ResourceDependency(library = "material-prime", name = "core/material-prime.js"),
        @ResourceDependency(library = "material-prime", name = "tree/tree.js"),

        @ResourceDependency(library="primefaces", name="components.css"),
        @ResourceDependency(library = "material-prime", name = "libs/materialize.css"),
        @ResourceDependency(library = "material-prime", name = "core/material-prime.css"),
})
public class Tree extends UITree implements Widget, RTLAware, ClientBehaviorHolder, PrimeClientBehaviorHolder {

    public static final String COMPONENT_TYPE = "org.primefaces.material.component.Tree";

    protected enum PropertyKeys {
        widgetVar,
        dynamic,
        cache,
        onNodeClick,
        style,
        styleClass,
        highlight,
        datakey,
        animate,
        orientation,
        propagateSelectionUp,
        propagateSelectionDown,
        dir,
        draggable,
        droppable,
        dragdropScope,
        dragMode,
        dropRestrict,
        tabindex;
        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {
        }

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }

    public Tree() {
        setRendererType(TreeRenderer.RENDERER_TYPE);
    }

    public String getFamily() {
        return MaterialPrime.COMPONENT_FAMILY;
    }

    public java.lang.String getWidgetVar() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(java.lang.String _widgetVar) {
        getStateHelper().put(Tree.PropertyKeys.widgetVar, _widgetVar);
    }

    public boolean isDynamic() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.dynamic, false);
    }

    public void setDynamic(boolean _dynamic) {
        getStateHelper().put(Tree.PropertyKeys.dynamic, _dynamic);
    }

    public boolean isCache() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.cache, true);
    }

    public void setCache(boolean _cache) {
        getStateHelper().put(Tree.PropertyKeys.cache, _cache);
    }

    public java.lang.String getOnNodeClick() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.onNodeClick, null);
    }

    public void setOnNodeClick(java.lang.String _onNodeClick) {
        getStateHelper().put(Tree.PropertyKeys.onNodeClick, _onNodeClick);
    }

    public java.lang.String getStyle() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.style, null);
    }

    public void setStyle(java.lang.String _style) {
        getStateHelper().put(Tree.PropertyKeys.style, _style);
    }

    public java.lang.String getStyleClass() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.styleClass, null);
    }

    public void setStyleClass(java.lang.String _styleClass) {
        getStateHelper().put(Tree.PropertyKeys.styleClass, _styleClass);
    }

    public boolean isHighlight() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.highlight, true);
    }

    public void setHighlight(boolean _highlight) {
        getStateHelper().put(Tree.PropertyKeys.highlight, _highlight);
    }

    public java.lang.Object getDatakey() {
        return (java.lang.Object) getStateHelper().eval(Tree.PropertyKeys.datakey, null);
    }

    public void setDatakey(java.lang.Object _datakey) {
        getStateHelper().put(Tree.PropertyKeys.datakey, _datakey);
    }

    public boolean isAnimate() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.animate, false);
    }

    public void setAnimate(boolean _animate) {
        getStateHelper().put(Tree.PropertyKeys.animate, _animate);
    }

    public java.lang.String getOrientation() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.orientation, "vertical");
    }

    public void setOrientation(java.lang.String _orientation) {
        getStateHelper().put(Tree.PropertyKeys.orientation, _orientation);
    }

    public boolean isPropagateSelectionUp() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.propagateSelectionUp, true);
    }

    public void setPropagateSelectionUp(boolean _propagateSelectionUp) {
        getStateHelper().put(Tree.PropertyKeys.propagateSelectionUp, _propagateSelectionUp);
    }

    public boolean isPropagateSelectionDown() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.propagateSelectionDown, true);
    }

    public void setPropagateSelectionDown(boolean _propagateSelectionDown) {
        getStateHelper().put(Tree.PropertyKeys.propagateSelectionDown, _propagateSelectionDown);
    }

    public java.lang.String getDir() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.dir, "ltr");
    }

    public void setDir(java.lang.String _dir) {
        getStateHelper().put(Tree.PropertyKeys.dir, _dir);
    }

    public boolean isDraggable() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.draggable, false);
    }

    public void setDraggable(boolean _draggable) {
        getStateHelper().put(Tree.PropertyKeys.draggable, _draggable);
    }

    public boolean isDroppable() {
        return (java.lang.Boolean) getStateHelper().eval(Tree.PropertyKeys.droppable, false);
    }

    public void setDroppable(boolean _droppable) {
        getStateHelper().put(Tree.PropertyKeys.droppable, _droppable);
    }

    public java.lang.String getDragdropScope() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.dragdropScope, null);
    }

    public void setDragdropScope(java.lang.String _dragdropScope) {
        getStateHelper().put(Tree.PropertyKeys.dragdropScope, _dragdropScope);
    }

    public java.lang.String getDragMode() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.dragMode, "self");
    }

    public void setDragMode(java.lang.String _dragMode) {
        getStateHelper().put(Tree.PropertyKeys.dragMode, _dragMode);
    }

    public java.lang.String getDropRestrict() {
        return (java.lang.String) getStateHelper().eval(Tree.PropertyKeys.dropRestrict, "none");
    }

    public void setDropRestrict(java.lang.String _dropRestrict) {
        getStateHelper().put(Tree.PropertyKeys.dropRestrict, _dropRestrict);
    }

    public int getTabindex() {
        return (java.lang.Integer) getStateHelper().eval(Tree.PropertyKeys.tabindex, 0);
    }

    public void setTabindex(int _tabindex) {
        getStateHelper().put(Tree.PropertyKeys.tabindex, _tabindex);
    }


    private Map<String, UITreeNode> nodes;

    public UITreeNode getUITreeNodeByType(String type) {
        UITreeNode node = getTreeNodes().get(type);

        if (node == null)
            throw new javax.faces.FacesException("Unsupported tree node type:" + type);
        else
            return node;
    }

    private boolean isRequestSource(FacesContext context) {
        return this.getClientId(context).equals(context.getExternalContext().getRequestParameterMap().get(Constants.RequestParams.PARTIAL_SOURCE_PARAM));
    }

    public boolean isNodeExpandRequest(FacesContext context) {
        return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_expandNode");
    }

    public boolean isSelectionRequest(FacesContext context) {
        return context.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(context) + "_instantSelection");
    }

    public static String CONTAINER_CLASS = "material-tree";
    public static String CONTAINER_RTL_CLASS = CONTAINER_CLASS + " rtl";
    public static String HORIZONTAL_CONTAINER_CLASS = "material-tree ui-tree-horizontal ui-widget ui-widget-content ui-corner-all";
    public static String ROOT_NODES_CLASS = "tree";
    public static String PARENT_NODE_CLASS = "tree-item tree-item-parent";
    public static String LEAF_NODE_CLASS = "tree-item tree-item-leaf";
    public static String CHILDREN_NODES_CLASS = "ui-treenode-children";
    public static String NODE_CONTENT_CLASS_V = "tree-header";
    public static String SELECTABLE_NODE_CONTENT_CLASS_V = "tree-header tree-selectable";
    public static String NODE_CONTENT_CLASS_H = "tree-header ui-state-default ui-corner-all";
    public static String SELECTABLE_NODE_CONTENT_CLASS_H = "tree-header tree-selectable ui-state-default ui-corner-all";
    public static String TOGGLER_CLASS = "material-tree-toggler";
    public static String EXPANDED_ICON_V = "keyboard_arrow_down";
    public static String COLLAPSED_ICON_V = "keyboard_arrow_right";
    public static String COLLAPSED_ICON_RTL_V = "keyboard_arrow_left";
    public static String EXPANDED_ICON_H = "remove";
    public static String COLLAPSED_ICON_H = "add";
    public static String LEAF_ICON = "a"; // equals a placeholder for no icon
    public static String NODE_ICON_CLASS = ""; //no icon
    public static String NODE_LABEL_CLASS = "tree-item-label";

    public Map<String, UITreeNode> getTreeNodes() {
        if (nodes == null) {
            nodes = new HashMap<String, UITreeNode>();
            for (UIComponent child : getChildren()) {
                UITreeNode node = (UITreeNode) child;
                nodes.put(node.getType(), node);
            }
        }

        return nodes;
    }

    private static final Map<String, Class<? extends BehaviorEvent>> BEHAVIOR_EVENT_MAPPING = Collections.unmodifiableMap(new HashMap<String, Class<? extends BehaviorEvent>>() {{
        put("select", NodeSelectEvent.class);
        put("unselect", NodeUnselectEvent.class);
        put("expand", NodeExpandEvent.class);
        put("collapse", NodeCollapseEvent.class);
        put("dragdrop", TreeDragDropEvent.class);
        put("contextMenu", NodeSelectEvent.class);
    }});

    private static final Collection<String> EVENT_NAMES = BEHAVIOR_EVENT_MAPPING.keySet();

    @Override
    public Map<String, Class<? extends BehaviorEvent>> getBehaviorEventMapping() {
        return BEHAVIOR_EVENT_MAPPING;
    }

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    @Override
    public void queueEvent(FacesEvent event) {
        FacesContext context = getFacesContext();

        if (isRequestSource(context) && event instanceof AjaxBehaviorEvent) {
            Map<String, String> params = context.getExternalContext().getRequestParameterMap();
            String eventName = params.get(Constants.RequestParams.PARTIAL_BEHAVIOR_EVENT_PARAM);
            String clientId = this.getClientId(context);
            FacesEvent wrapperEvent = null;
            AjaxBehaviorEvent behaviorEvent = (AjaxBehaviorEvent) event;

            if (eventName.equals("expand")) {
                this.setRowKey(params.get(clientId + "_expandNode"));
                TreeNode expandedNode = this.getRowNode();
                expandedNode.setExpanded(true);

                wrapperEvent = new NodeExpandEvent(this, behaviorEvent.getBehavior(), expandedNode);
            } else if (eventName.equals("collapse")) {
                this.setRowKey(params.get(clientId + "_collapseNode"));
                TreeNode collapsedNode = this.getRowNode();
                collapsedNode.setExpanded(false);

                wrapperEvent = new NodeCollapseEvent(this, behaviorEvent.getBehavior(), collapsedNode);
            } else if (eventName.equals("select")) {
                setRowKey(params.get(clientId + "_instantSelection"));

                wrapperEvent = new NodeSelectEvent(this, behaviorEvent.getBehavior(), this.getRowNode());
            } else if (eventName.equals("unselect")) {
                setRowKey(params.get(clientId + "_instantUnselection"));

                wrapperEvent = new NodeUnselectEvent(this, behaviorEvent.getBehavior(), this.getRowNode());
            } else if (eventName.equals("dragdrop")) {
                int dndIndex = Integer.parseInt(params.get(clientId + "_dndIndex"));

                wrapperEvent = new TreeDragDropEvent(this, behaviorEvent.getBehavior(), dragNode, dropNode, dndIndex);
            } else if (eventName.equals("contextMenu")) {
                setRowKey(params.get(clientId + "_contextMenuNode"));

                wrapperEvent = new NodeSelectEvent(this, behaviorEvent.getBehavior(), this.getRowNode(), true);
            }

            wrapperEvent.setPhaseId(behaviorEvent.getPhaseId());

            super.queueEvent(wrapperEvent);

            this.setRowKey(null);
        } else {
            super.queueEvent(event);
        }
    }

    private boolean isToggleRequest(FacesContext context) {
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        String clientId = getClientId(context);

        return params.get(clientId + "_expandNode") != null || params.get(clientId + "_collapseNode") != null;
    }

    public boolean isDragDropRequest(FacesContext context) {
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        String clientId = getClientId(context);
        String source = context.getExternalContext().getRequestParameterMap().get(Constants.RequestParams.PARTIAL_SOURCE_PARAM);

        return clientId.equals(source) && params.get(clientId + "_dragdrop") != null;
    }

    private boolean shouldSkipNodes(FacesContext context) {
        return this.isToggleRequest(context) || this.isDragDropRequest(context);
    }

    @Override
    public void processDecodes(FacesContext context) {
        if (shouldSkipNodes(context)) {
            this.decode(context);
        } else {
            super.processDecodes(context);
        }
    }

    @Override
    public void processValidators(FacesContext context) {
        if (!shouldSkipNodes(context)) {
            super.processValidators(context);
        }
    }

    @Override
    public void processUpdates(FacesContext context) {
        if (shouldSkipNodes(context)) {
            this.updateSelection(context);
        } else {
            super.processUpdates(context);
        }
    }

    public boolean isCheckboxSelection() {
        String selectionMode = this.getSelectionMode();

        return selectionMode != null && selectionMode.equals("checkbox");
    }

    public boolean isRTL() {
        return this.getDir().equalsIgnoreCase("rtl");
    }

    private TreeNode dragNode;
    private TreeNode dropNode;

    TreeNode getDragNode() {
        return dragNode;
    }

    void setDragNode(TreeNode dragNode) {
        this.dragNode = dragNode;
    }

    TreeNode getDropNode() {
        return dropNode;
    }

    void setDropNode(TreeNode dropNode) {
        this.dropNode = dropNode;
    }

    @Override
    protected boolean shouldVisitNode(TreeNode node) {
        return this.isDynamic() ? (node.isExpanded() || node.getParent() == null) : true;
    }

    @Override
    protected void processColumnChildren(FacesContext context, PhaseId phaseId, String nodeKey) {
        setRowKey(nodeKey);
        TreeNode treeNode = this.getRowNode();

        if (treeNode == null)
            return;

        String treeNodeType = treeNode.getType();

        for (UIComponent child : getChildren()) {
            if (child instanceof UITreeNode && child.isRendered()) {
                UITreeNode uiTreeNode = (UITreeNode) child;

                if (!treeNodeType.equals(uiTreeNode.getType()))
                    continue;

                for (UIComponent grandkid : child.getChildren()) {
                    if (!grandkid.isRendered())
                        continue;

                    if (phaseId == PhaseId.APPLY_REQUEST_VALUES)
                        grandkid.processDecodes(context);
                    else if (phaseId == PhaseId.PROCESS_VALIDATIONS)
                        grandkid.processValidators(context);
                    else if (phaseId == PhaseId.UPDATE_MODEL_VALUES)
                        grandkid.processUpdates(context);
                    else
                        throw new IllegalArgumentException();
                }
            }
        }
    }

    @Override
    protected void validateSelection(FacesContext context) {
        String selectionMode = this.getSelectionMode();

        if (selectionMode != null && this.isRequired()) {
            Object selection = this.getLocalSelectedNodes();
            boolean isValueBlank = (selectionMode.equalsIgnoreCase("single")) ? (selection == null) : (((TreeNode[]) selection).length == 0);

            if (isValueBlank) {
                super.updateSelection(context);
            }
        }

        super.validateSelection(context);
    }

    public String resolveWidgetVar() {
        FacesContext context = getFacesContext();
        String userWidgetVar = (String) getAttributes().get("widgetVar");

        if (userWidgetVar != null)
            return userWidgetVar;
        else
            return "widget_" + getClientId(context).replaceAll("-|" + UINamingContainer.getSeparatorChar(context), "_");
    }
}
