/**
 * Created by Peter's Desktop on 7/22/2014.
 */

require(['jquery', 'underscore', 'marionette', 'Router'], function ($, _, marionette, Router) {
    marionette.ItemView.prototype.render = function () {
        this._ensureViewIsIntact();

        this.triggerMethod('before:render', this);

        var data = this.serializeData();
        data = this.mixinTemplateHelpers(data);

        var template = this.getTemplate();
        if (template != null) {
            var html = Marionette.Renderer.render(template, data);
            this.attachElContent(html);
        }
        this.bindUIElements();

        this.triggerMethod('render', this);

        return this;
    };
    new Router();
});

function modalOpen (type, key) {
    var modal_width = 540;
    var modal_height = 'auto';
    var additionalModalOpenFn;
    switch (type) {
        default:
            modal_width = 'auto';
            modal_height = 'auto';
            break;
    }
    // create base modal dialog window
    var poundKey = $('#' + key);
    poundKey.dialog({
        bgiframe: true,
        autoOpen: false,
        resizable: false,
        width: modal_width,
        height: modal_height,
        minHeight: 190,
        show: 'fade',
        hide: 'fade',
        zIndex: 2000,
        position: {
            my: 'top',
            at: 'top',
            offset: '0 52'
        },
        modal: true,
        stack: false,
        closeOnEscape: false,
        open: _.bind(function (e, ui) {
            if (additionalModalOpenFn)
                additionalModalOpenFn($(this));

            window.setTimeout(function () {
                jQuery(document).unbind('mousedown.dialog-overlay').unbind('mouseup.dialog-overlay');
            }, 100);
            $(".ui-dialog-titlebar").hide();
            $(".ui-dialog-titlebar-close").hide();

            $('.ui-widget-overlay').click(function () {
                $('#' + key).dialog("close");
            });
        }, this),
        close: function () {
            // do nothing
        }
    });
    poundKey.dialog('open');
    $('#body').css("overflow", "hidden");
}

function modalClose (key) {
    // close modal dialog window
    $('#' + key).dialog("close");
    $('#body').css("overflow", "scroll");

    return false;
}
